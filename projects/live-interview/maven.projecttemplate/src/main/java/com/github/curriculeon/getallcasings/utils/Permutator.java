package com.github.curriculeon.getallcasings.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/3/2020.
 */
public class Permutator<SomeType> {
    private SomeType[] originalArray;

    public Permutator(SomeType[] originalArray) {
        this.originalArray = originalArray;
    }

    public List<List<SomeType>> permute() {
        List<List<SomeType>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < originalArray.length; i++) {
            //list of list in current iteration of the array num
            List<List<SomeType>> current = new ArrayList<>();
            for (List<SomeType> currentList : result) {
                for (int j = 0; j < currentList.size() + 1; j++) {
                    // + add num[i] to different locations
                    currentList.add(j, originalArray[i]);
                    List<SomeType> temp = new ArrayList<>(currentList);
                    current.add(temp);
                    currentList.remove(j);
                }
            }

            result = new ArrayList<>(current);
        }

        return result;
    }
}
