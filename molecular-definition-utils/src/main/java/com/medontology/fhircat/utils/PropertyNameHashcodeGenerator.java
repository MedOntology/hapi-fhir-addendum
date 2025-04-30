package com.medontology.fhircat.utils;

/**
 * Class used to generate name-hashcode pairs used in
 * property search methods in HAPI FHIR.
 */
public class PropertyNameHashcodeGenerator {

    /**
     * Generates the hashcode for a property name in the format - 'property-name:hashcode'
     * @param str
     * @return
     */
    public static String getHashcode(String str) {
        return str + ": " + str.hashCode();
    }

    /**
     * Generates list of property-name/hashcodes
     * @param str1
     * @return
     */
    public static String getHashcode(String... str1) {
        StringBuilder str = new StringBuilder();
        for (String s : str1) {
            str.append(getHashcode(s)).append("\n");
        }
        return str.toString();
    }
}
