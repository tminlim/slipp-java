package net.slipp.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	static void sortAsc(ArrayList<Person> persons) {
		for (int i = 0; i < persons.size() - 1; i++) {
			int targetIndex = findTargetIndex(persons, i, true);
			Collections.swap(persons, i, targetIndex);
		}
	}
	
	private static int findTargetIndex(ArrayList<Person> values, int currentIndex, boolean isAsc) {
		int targetIndex = currentIndex;
		for (int j = currentIndex+1; j < values.size(); j++) {
			boolean result = values.get(j).compareTo(values.get(targetIndex));
			if (isAsc) {
				if (result) {
					targetIndex = j;
				}
			} else {
				if (!result) {
					targetIndex = j;
				}
			}
		}
		return targetIndex;
	}
	
	static void sortDesc(ArrayList<Person> persons) {
		for (int i = 0; i < persons.size() - 1; i++) {
			int maximumIndex = findTargetIndex(persons, i, false);
			Collections.swap(persons, i, maximumIndex);
		}		
	}
}
