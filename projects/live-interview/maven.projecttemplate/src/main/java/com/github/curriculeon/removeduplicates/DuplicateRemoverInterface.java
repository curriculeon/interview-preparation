package com.github.curriculeon.removeduplicates;

public interface DuplicateRemoverInterface {
    String[] removeDuplicatesOccurringMoreThan3();

    String[] removeDuplicates(Integer numberOfDuplicationsToRemove);
}
