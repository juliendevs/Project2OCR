package com.hemebiotech.analytics;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class SymptomsWriter {

    /**
     *
     * @param symptoms
     * Write in file result.out from Map symptoms with a BufferedWriter
     * Associating key and value from countFrequency and getSymptoms
     */

    public SymptomsWriter (Map<String, Integer> symptoms) {
        File file = new File("result.out");
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                bf.write(entry.getKey() + " = " + entry.getValue());
                bf.newLine();
                bf.flush();
            }
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
