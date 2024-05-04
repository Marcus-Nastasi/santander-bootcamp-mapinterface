package com.santander.mapinterface;

import com.santander.mapinterface.basicOperations.Dictionary;
import com.santander.mapinterface.basicOperations.Phonebook;

public class Main {
    public static void main(String[] args) {
        testPhonebook();
        testDictionary();
    }

    public static void testPhonebook() {
        System.out.println("\n--- Phonebook ---");
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Lewa", "11 84398439843");
        phonebook.addContact("Kaya", "11 09212120321");
        phonebook.searchByName("Kaya");
        System.out.println("\n--- phonebook show all ---");
        phonebook.showAll();
    }

    public static void testDictionary() {
        System.out.println("\n--- Dictionary ---");
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("Apple", "It's a fruit.");
        dictionary.addWord("Dog", "A canine kind of life.");
        dictionary.addWord("Cat", "A feline kind of life.");
        System.out.println(dictionary.getDefinition("Cat"));
        System.out.println(dictionary.getDefinition("Dog"));
        System.out.println(dictionary.getDefinition("Apple"));
    }
}


