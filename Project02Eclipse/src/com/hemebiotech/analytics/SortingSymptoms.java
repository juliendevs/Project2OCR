package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.TreeMap;


/**
 * Method to sort symptoms in "result.out" alphabetically
 * Convert HashMap into TreeMap
 * @return treeSymptoms
 *
 */



public class SortingSymptoms {
    public static TreeMap<String, Integer> sortSymptoms(HashMap<String, Integer> symptomsFrequency) {
        TreeMap treeSymptoms = new TreeMap<>(symptomsFrequency);
        return treeSymptoms;

    }
}
