package com.santander.mapinterface.ordenation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EventBook {

    private final Map<Date, Event> eventBook = new HashMap<>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public EventBook() {}

    public void addEvent(String date, String name, String description) throws ParseException {
        this.eventBook.put(sdf.parse(date), new Event(name, description));
    }

    public void showAll() {
        System.out.println(this.eventBook);
    }
}


