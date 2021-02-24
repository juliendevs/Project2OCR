package com.hemebiotech.analytics;


import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;


/**
* Modifications :
 * @author = Julien
 * 28/01/2021 - @author
 * Added "highPressureCount" as a method of test, following the given indications in the mail from Caroline
 * Removed unhelpful comments (declarations)
 *
 * 01/02/2021 - @author
 * Commented count by reader, added Map String interface
 *
*/


public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {
		List<String> symptomsList;
		ReadSymptomDataFromFile symptomsReader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		symptomsList = symptomsReader.getSymptoms();


		HashMap<String, Integer> symptomsFrequency = AnalyticsCounter.countFrequency(symptomsList);
		TreeMap<String, Integer> sortedSymptoms = SortingSymptoms.sortSymptoms(symptomsFrequency);

		SymptomsWriter symptomsWriter = new SymptomsWriter(sortedSymptoms);
	}


	/**
	 * @param symptoms
	 * @return symptomsFrequency
	 * @throws Exception
	 * HashMap to store the frequencies of symptoms
	 *
	 */
	public static HashMap<String, Integer> countFrequency(List<String> symptoms) throws Exception {

		/* To make sure the key is unique  */
		HashMap<String, Integer> symptomsFrequency = new HashMap<>();

		/* incrementing numbers of symptoms in the HashMap */
		for (int i = 0 ; i < symptoms.size() ; i++) {
			boolean symptomsExists = symptomsFrequency.containsKey(symptoms.get(i));
			if (symptomsExists) {
				int nbOccurrence = symptomsFrequency.get(symptoms.get(i));
				nbOccurrence = nbOccurrence + 1;
				symptomsFrequency.put(symptoms.get(i), nbOccurrence);
			} else {
				symptomsFrequency.put(symptoms.get(i), 1);
			}
		}
		return symptomsFrequency;
	}
}








