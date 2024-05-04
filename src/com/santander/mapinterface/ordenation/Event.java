package com.santander.mapinterface.ordenation;

public class Event {

    private final String eventName;
    private final String description;

    public Event(String eventName, String description) {
        this.eventName = eventName;
        this.description = description;
    }

    @Override
    public String toString() {
        return(
            "Event{" + "eventName='" + eventName + '\'' +
            ", description='" + description + '\'' + '}'
        );
    }

    public String getEventName() {
        return eventName;
    }

    public String getDescription() {
        return description;
    }
}

