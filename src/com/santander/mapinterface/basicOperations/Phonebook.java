package com.santander.mapinterface.basicOperations;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private final Map<String, String> phonebook = new HashMap<>();

    public Phonebook() {}

    public void addContact(String name, String number) {
        this.phonebook.put(name, number);
    }

    public void removeContact(String name) {
        this.phonebook.remove(name);
    }

    public void showAll() {
        System.out.println(this.phonebook.values());
    }

    public void searchByName(String name) {
        String value = null;
        if(this.phonebook.containsKey(name)) value = this.phonebook.get(name);
        if(value != null) System.out.println(name + ": " + value);
    }
}

