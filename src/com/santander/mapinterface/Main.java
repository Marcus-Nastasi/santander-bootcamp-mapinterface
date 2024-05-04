package com.santander.mapinterface;

import com.santander.mapinterface.basicOperations.Phonebook;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.addContact("Lewa", "11 84398439843");
        phonebook.addContact("Kaya", "11 09212120321");

        phonebook.searchByName("Kaya");
    }
}

