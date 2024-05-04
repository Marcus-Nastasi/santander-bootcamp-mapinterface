package com.santander.mapinterface;

import com.santander.mapinterface.basicOperations.Dictionary;
import com.santander.mapinterface.basicOperations.Phonebook;

public class Main {
    public static void main(String[] args) {
        //testPhonebook();
        testDictionary();
    }

    public static void testPhonebook() {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Lewa", "11 84398439843");
        phonebook.addContact("Kaya", "11 09212120321");
        phonebook.searchByName("Kaya");
    }

    public static void testDictionary() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("Apple", "It's a fruit.");
        dictionary.addWord("Dog", "A canine kind of life.");
        dictionary.addWord("Cat", "A feline kind of life.");
        String catDef = dictionary.getDefinition("Cat");
        System.out.println(catDef);
    }
}


