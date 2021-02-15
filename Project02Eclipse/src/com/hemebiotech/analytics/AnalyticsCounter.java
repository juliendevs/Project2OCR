package com.hemebiotech.analytics;


import java.io.*;
import java.util.*;


/**
* Modifications :
 * @author Julien
 * 28/01/2021 - @author
 * Added "highPressureCount" as a method of test, following the given indications in the mail from Caroline
 * Removed unhelpful comments (declarations)
 *
 * 01/02/2021 - @author
 * Commented count by reader, added Map String interface
*/

public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {
		HashMap<String, Integer> symptomsFrequency = AnalyticsCounter.countFrequency("Project02Eclipse/symptoms.txt");
		TreeMap<String, Integer> sortedSymptoms = SortingSymptoms.sortSymptoms(symptomsFrequency);


		System.out.println(Arrays.asList(symptomsFrequency));
		SymptomsWriter symptomsWriter = new SymptomsWriter(sortedSymptoms);

	}

	public static HashMap<String, Integer> countFrequency(String filename) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line;

		int i = 0;

		ArrayList<String> symptoms = new ArrayList<>();
		/* On s'assure avec une hashmap que la clé est unique */
		HashMap<String, Integer> symptomsFrequency = new HashMap<>();


		while ((line = reader.readLine()) != null) {
			boolean symptomsExists = symptomsFrequency.containsKey(line);
			System.out.println(symptomsExists);
			if (symptomsExists) {
				int nbOccurrence = symptomsFrequency.get(line);
				nbOccurrence = nbOccurrence + 1;
				symptomsFrequency.put(line, nbOccurrence);
			} else {
				symptomsFrequency.put(line, 1);
			}
		}


//		for (HashMap.Entry<String, Integer> entry : symptomsFrequency.entrySet()) {
//			ResultWriter symptomsWriter = new ResultWriter(symptomsFrequency);
//			symptomsWriter. ;

		return symptomsFrequency;
	}
}


		// 		pourchaque ($lignes as $ligne) {
//  	si ($sortie[$ligne] existe pas donc $sortie[$ligne] = 1
//  	sinon $sortie[$ligne]++;


//			int headCount = 0;
//
//		int rashCount = 0;
//		int pupilCount = 0;
//		int highPressureCount = 0;

//		while (line != null) {
//			i++;
//			System.out.println("symptom from file: " + line);


		// next generate output








