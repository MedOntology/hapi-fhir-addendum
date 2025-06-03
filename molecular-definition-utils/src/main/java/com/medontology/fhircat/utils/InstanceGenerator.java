package com.medontology.fhircat.utils;

import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.r5.model.*;

public class InstanceGenerator {

    public static final CodeableConcept TPMT1 = new CodeableConcept().addCoding(new Coding().setCode("TPMT*1").setSystem("https://liu.se/en/research/tpmt-nomenclature-committee").setDisplay("TPMT*1").setVersion("Nov 2022"));
    public static final CodeableConcept TPMT3C = new CodeableConcept().addCoding(new Coding().setCode("TPMT*3C").setSystem("https://liu.se/en/research/tpmt-nomenclature-committee").setDisplay("TPMT*3C").setVersion("Nov 2022"));
    public static final CodeableConcept NUDT15_1 = new CodeableConcept().addCoding(new Coding().setCode("PV01597").setSystem("https://pharmvar.org").setDisplay("NUDT15*1").setVersion("6.2.6"));
    public static final CodeableConcept NUDT15_3 = new CodeableConcept().addCoding(new Coding().setCode("PV01599").setSystem("https://pharmvar.org").setDisplay("NUDT15*3").setVersion("6.2.6"));

    public static final CodeableConcept HGNC12014 = new CodeableConcept().addCoding(new Coding().setCode("HGNC:12014").setSystem("http://www.genenames.org").setDisplay("HGNC:12014"));
    public static final CodeableConcept HGNC23063 = new CodeableConcept().addCoding(new Coding().setCode("HGNC:23063").setSystem("http://www.genenames.org").setDisplay("HGNC:23063"));

    public static final CodeableConcept MYGENO100 = new CodeableConcept().addCoding(new Coding().setCode("mygeno:100").setSystem("http://www.mygenotypes.org").setDisplay("TPMT*1/*3C"));
    public static final CodeableConcept MYGENO200 = new CodeableConcept().addCoding(new Coding().setCode("mygeno:200").setSystem("http://www.mygenotypes.org").setDisplay("NUDT15*1/*3"));

    private FhirContext ctx = FhirContext.forR5();

    public String generateTest1() {
        Bundle bundle = new Bundle();
        Observation labResult = new Observation();
        labResult.setCode(new CodeableConcept().setText("Genetic Panel"));
        labResult.setValue(new Reference().setReference("MolecularDefinition/1"));
        bundle.addEntry().setResource(labResult);
        return ctx.newJsonParser().encodeResourceToString(bundle);
    }

    public String generateMedicationRequest() {
        Bundle bundle = new Bundle();
        MedicationRequest medicationRequest = new MedicationRequest();
        CodeableReference codeableReference = new CodeableReference();
        codeableReference.setConcept(new CodeableConcept(new Coding("http://loinc.org", "1256", "azathioprine")));
        medicationRequest.setMedication(codeableReference);
        bundle.addEntry().setResource(medicationRequest);
        return ctx.newJsonParser().encodeResourceToString(bundle);
    }

    public String generateHaplotype(String id,
                                    String identifierSystem,
                                    String identifierValue,
                                    String description,
                                    String molecule,
                                    String repFocus,
                                    CodeableConcept repCode,
                                    CodeableConcept associatedGene
    ) {
        MolecularDefinition haplotype = new MolecularDefinition();
        haplotype.setId(id);
        haplotype.addIdentifier().setSystem(identifierSystem).setValue(identifierValue);
        haplotype.setDescription(new MarkdownType(description));
        haplotype.setMoleculeType(new CodeableConcept().setText(molecule));
        MolecularDefinition.MolecularDefinitionRepresentationComponent representation = haplotype.addRepresentation().setFocus(new CodeableConcept().setText(repFocus));
        representation.addCode(repCode);
        haplotype.addExtension().setUrl("http://fhircat.org/haplotype-associated-gene").setValue(associatedGene);
        return ctx.newJsonParser().encodeResourceToString(haplotype);
    }

    public String generateGenotype(String id,
                                   String identifierSystem,
                                   String identifierValue,
                                   String description,
                                   String molecule,
                                   String repFocus,
                                   CodeableConcept repCode,
                                   CodeableConcept associatedGene,
                                   String haplotype1,
                                   String haplotype2
    ) {
        MolecularDefinition haplotype = new MolecularDefinition();
        haplotype.setId(id);
        haplotype.addIdentifier().setSystem(identifierSystem).setValue(identifierValue);
        haplotype.setDescription(new MarkdownType(description));
        haplotype.setMoleculeType(new CodeableConcept().setText(molecule));
        MolecularDefinition.MolecularDefinitionRepresentationComponent representation = haplotype.addRepresentation().setFocus(new CodeableConcept().setText(repFocus));
        representation.addCode(repCode);
        haplotype.addMember(new Reference().setReference(haplotype1));
        haplotype.addMember(new Reference().setReference(haplotype2));
        haplotype.addExtension().setUrl("http://fhircat.org/haplotype-associated-gene").setValue(associatedGene);
        return ctx.newJsonParser().encodeResourceToString(haplotype);
    }

    public static void main(String[] args) {
        InstanceGenerator ig = new InstanceGenerator();
        System.out.println(ig.generateTest1());
        System.out.println(ig.generateMedicationRequest());

        System.out.println(ig.generateHaplotype("MolecularDefinition/1",
                "http://fhircat.org",
                "TPMT *1",
                "Definition of haplotype TPMT*1",
                "DNA",
                "haplotype",
                TPMT1,
                HGNC12014
                ));

        System.out.println(ig.generateHaplotype("MolecularDefinition/2",
                "http://fhircat.org",
                "TPMT *3C",
                "Definition of haplotype TPMT*3C",
                "DNA",
                "haplotype",
                TPMT3C,
                HGNC12014
                ));

        System.out.println(ig.generateHaplotype("MolecularDefinition/3",
                "http://fhircat.org",
                "NUDT15 *1",
                "Definition of haplotype TPMT*1",
                "DNA",
                "haplotype",
                NUDT15_1,
                HGNC23063
                ));

        System.out.println(ig.generateHaplotype("MolecularDefinition/4",
                "http://fhircat.org",
                "NUDT15 *3",
                "Definition of haplotype TPMT*1",
                "DNA",
                "haplotype",
                NUDT15_3,
                HGNC23063
                ));

        System.out.println(ig.generateGenotype("MolecularDefinition/100",
                "http://fhircat.org",
                "TPMT *1/*3C",
                "Definition of genotype TPMT*1/*3C",
                "DNA",
                "genotype",
                MYGENO100,
                HGNC12014,
                "MolecularDefinition/1",
                "MolecularDefinition/2"));

        System.out.println(ig.generateGenotype("MolecularDefinition/200",
                "http://fhircat.org",
                "NUDT15 *1/*3",
                "Definition of genotype NUDT15*1/*3",
                "DNA",
                "genotype",
                MYGENO200,
                HGNC23063,
                "MolecularDefinition/3",
                "MolecularDefinition/4"));
    }
}
