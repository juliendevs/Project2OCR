package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;


/**
 * Method to sort symptoms in "result.out" alphabetically
 */

public class SortingSymptoms {
    public static TreeMap<String, Integer> sortSymptoms(HashMap<String, Integer> symptomsFrequency) {
        TreeMap treeSymptoms = new TreeMap<String, Integer>(symptomsFrequency);
        return treeSymptoms;

    }
}
