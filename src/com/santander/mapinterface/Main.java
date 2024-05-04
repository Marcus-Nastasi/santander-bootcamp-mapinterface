package com.santander.mapinterface;

import com.santander.mapinterface.basicOperations.Dictionary;
import com.santander.mapinterface.basicOperations.Phonebook;
import com.santander.mapinterface.searchMap.Stock;

public class Main {
    public static void main(String[] args) {
        //testPhonebook();
        //testDictionary();
        testStock();
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

    public static void testStock() {
        Stock stock = new Stock();
        stock.addProduct(1, "Apple", 1, 1.99);
        stock.addProduct(2, "Banana", 1, 2.20);
        System.out.println("\n--- Stock ---");
        stock.showAll();
        System.out.println(stock.totalValue());
        System.out.println(stock.getExpensiver());
    }
}


