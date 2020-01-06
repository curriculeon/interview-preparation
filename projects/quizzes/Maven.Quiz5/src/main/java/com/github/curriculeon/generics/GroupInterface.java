package com.github.curriculeon.generics;

/**
 * @author leon on 18/12/2018.
 */
public interface GroupInterface<_> extends Iterable<_> {
    Integer count();
    Boolean has(_ valueToInsert);
    _ fetch(int indexOfValue);
    void insert(_ string);
    void delete(_ valueToInsert);
    void clear();
}
