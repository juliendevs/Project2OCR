package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 *
	 * @param filepath
	 * Put data from file into List symptomsList
	 *
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 *
	 * @return result into the List getSymptoms
	 * Create ArrayList symptoms which will be convert into Map in the main
	 */
	@Override
	public List<String> getSymptoms() {
		List<String> result = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String line;
			ArrayList<String> symptoms = new ArrayList<>();

			while ((line = reader.readLine()) != null) {
				symptoms.add(line);
			}
			result = symptoms;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
