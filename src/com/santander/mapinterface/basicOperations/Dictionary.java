package com.santander.mapinterface.basicOperations;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final Map<String, String> dictionary = new HashMap<>();

    public Dictionary() {}

    public void addWord(String word, String definition) {
        this.dictionary.put(word, definition);
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }

    public String getDefinition(String word) {
        return this.dictionary.get(word);
    }
}


