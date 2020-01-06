package com.github.curriculeon.part2.router;


class Pair<KeyType, ValueTyp> {
    private KeyType key;
    private ValueTyp value;

    public Pair(KeyType key, ValueTyp value) {
        this.key = key;
        this.value = value;
    }

    public KeyType getKey() {
        return key;
    }

    public ValueTyp getValue() {
        return value;
    }
}