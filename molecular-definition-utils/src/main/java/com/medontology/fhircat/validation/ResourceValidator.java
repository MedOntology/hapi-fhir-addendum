package com.medontology.fhircat.validation;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.support.DefaultProfileValidationSupport;
import ca.uhn.fhir.validation.FhirValidator;
import ca.uhn.fhir.validation.ValidationResult;
import org.hl7.fhir.common.hapi.validation.support.*;
import org.hl7.fhir.common.hapi.validation.validator.FhirInstanceValidator;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r5.model.MolecularDefinition;
import org.hl7.fhir.r5.model.StructureDefinition;

import java.io.FileReader;

public class ResourceValidator {

    private final FhirContext ctx = FhirContext.forR5();
    private final ValidationSupportChain supportChain = new ValidationSupportChain();
    ;

    public ResourceValidator() {
    }

    public FhirContext getCtx() {
        return ctx;
    }

    public ValidationSupportChain getSupportChain() {
        return supportChain;
    }

    public void init() {

        /*
            DefaultProfileValidationSupport supplies base FHIR definitions. 
            This is generally required even if you are using custom profiles, 
            since those profiles will derive from the base definitions.
         */
        DefaultProfileValidationSupport defaultSupport = new DefaultProfileValidationSupport(ctx);
        supportChain.addValidationSupport(defaultSupport);

        // This module supplies several code systems that are commonly used in validation
        supportChain.addValidationSupport(new CommonCodeSystemsTerminologyService(ctx));

        // This module implements terminology services for in-memory code validation
        supportChain.addValidationSupport(new InMemoryTerminologyServerValidationSupport(ctx));

        /*
            Create a PrePopulatedValidationSupport which can be used
            to load custom definitions. In this example we're loading
            two things, but in a real scenario we might load many
            StructureDefinitions, ValueSets, CodeSystems, etc.
        */
        PrePopulatedValidationSupport prePopulatedSupport = new PrePopulatedValidationSupport(ctx);
        loadCustomProfiles(prePopulatedSupport);

        // Add the custom definitions to the chain
        supportChain.addValidationSupport(prePopulatedSupport);
    }

    /**
     * Loads custom profiles to support FHIRCat project
     */
    protected void loadCustomProfiles(PrePopulatedValidationSupport prePopulatedSupport) {
        try {

            StructureDefinition profile = (StructureDefinition) ctx.newJsonParser().parseResource(
                    new FileReader("src/main/resources/PatientProfile_Active_True.txt")
            );

            StructureDefinition moldefStructDef = (StructureDefinition) ctx.newJsonParser().parseResource(
                    new FileReader("src/main/resources/MolecularDefinition_StructureDefinition.json")
            );

            prePopulatedSupport.addStructureDefinition(profile);
            prePopulatedSupport.addStructureDefinition(moldefStructDef);
            //prePopulatedSupport.addValueSet(someValueSet);

        } catch (Exception e) {
            throw new RuntimeException("Error loading profiles", e);
        }
    }

    /**
     * Create a validator using the FhirInstanceValidator module. We can use this validator to perform validation
     * https://registry.fhir.org/package/hl7.fhir.uv.extensions.r5%7C1.0.0
     *
     * @param resource
     */
    public void validate(IBaseResource resource) {
        FhirInstanceValidator validatorModule = new FhirInstanceValidator(supportChain);
        FhirValidator validator = ctx.newValidator().registerValidatorModule(validatorModule);
        ValidationResult result = validator.validateWithResult(resource);
        System.out.println(result);
    }
}
