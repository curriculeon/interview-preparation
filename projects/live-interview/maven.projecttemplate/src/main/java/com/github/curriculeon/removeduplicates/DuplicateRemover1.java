package com.github.curriculeon.removeduplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 2/4/2020.
 */
public class DuplicateRemover1 implements DuplicateRemoverInterface {
    private String[] array;

    @Override
    public String[] removeDuplicatesOccurringMoreThan3() {
        return removeDuplicates(3);
    }

    @Override
    public String[] removeDuplicates(Integer numberOfDuplicationsToRemove) {
        List<String> result = new ArrayList<>();
        for(String string : array) {
            int numberOfOccurrences = Collections.frequency(Arrays.asList(array), string);
            if(numberOfOccurrences < numberOfDuplicationsToRemove) {
                result.add(string);
            }
        }
        return result.toArray(new String[0]);
    }
}
