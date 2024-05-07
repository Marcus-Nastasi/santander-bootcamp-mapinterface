package com.santander.mapinterface.ordenation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventBook {

    private final Map<Date, Event> eventBook = new HashMap<>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public EventBook() {}

    public void addEvent(String date, String name, String description) throws ParseException {
        this.eventBook.put(sdf.parse(date), new Event(name, description));
    }

    public void showAll() throws RuntimeException {
        if(this.eventBook.isEmpty()) throw new RuntimeException("Event book empty.");
        Map<Date, Event> dateEventMap = new TreeMap<>(this.eventBook);
        System.out.println(dateEventMap);
    }

    public Event nextEvent() throws RuntimeException {
        if(this.eventBook.isEmpty()) throw new RuntimeException("Event book empty.");
        Date date = new Date();
        Event nextEvent = null;
        Map<Date, Event> dateEventMap = new TreeMap<>(this.eventBook);
        for(Date d: dateEventMap.keySet()) if(d.after(date)) {
            nextEvent = this.eventBook.get(d);
            break;
        }
        return nextEvent;
    }
}


