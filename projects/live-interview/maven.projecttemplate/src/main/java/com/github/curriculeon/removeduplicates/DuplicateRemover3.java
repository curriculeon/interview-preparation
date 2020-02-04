package com.github.curriculeon.removeduplicates;

import java.util.*;

/**
 * Created by leon on 2/4/2020.
 */
public class DuplicateRemover3 {
    public String[] removeDuplicates(String[] arrayToRemoveFrom, Integer numberOfDuplicationsToRemove) {
        List<String> result = new ArrayList<>();
        for(String string : arrayToRemoveFrom) {
            int numberOfOccurrences = Collections.frequency(Arrays.asList(arrayToRemoveFrom), string);
            if(numberOfOccurrences < numberOfDuplicationsToRemove) {
                result.add(string);
            }
        }
        return result.toArray(new String[0]);
    }
}
