package com.santander.mapinterface;

import com.santander.mapinterface.basicOperations.Dictionary;
import com.santander.mapinterface.basicOperations.Phonebook;
import com.santander.mapinterface.ordenation.EventBook;
import com.santander.mapinterface.searchMap.Stock;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        try {
            testPhonebook();
            testDictionary();
            testStock();
            testEvent();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
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

    public static void testEvent() throws ParseException {
        System.out.println("\n--- Event ---");
        EventBook eventBook = new EventBook();
        eventBook.addEvent("10/01/2024", "Kendrick Lamar", "Kendrick Lamar's show");
        eventBook.addEvent("12/02/2024", "Pharel", "Pharel's show");
        eventBook.addEvent("12/05/2024", "New Ev", "New Ev's show");
        eventBook.addEvent("13/05/2024", "New New", "New New show");
        eventBook.showAll();
        System.out.println(eventBook.nextEvent());
    }
}


