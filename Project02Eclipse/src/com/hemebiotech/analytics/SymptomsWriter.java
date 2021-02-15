package com.hemebiotech.analytics;


import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class SymptomsWriter {

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
