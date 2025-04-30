package com.medontology.fhircat.validation;

import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.r5.model.MolecularDefinition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResourceValidatorTest {

    @Test
    void validate() {
        ResourceValidator resourceValidator = new ResourceValidator();
        resourceValidator.init();
        try {
            MolecularDefinition molecularDefinition = new MolecularDefinition();
            molecularDefinition.addIdentifier().setSystem("http://fhircat.org").setValue("123");
            System.out.println(resourceValidator.getCtx().newJsonParser().encodeResourceToString(molecularDefinition));
            resourceValidator.validate(molecularDefinition);
        } catch(Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}