package com.example.ifst;

public class EventLists {
    private String session;
    private String venue;
    private String time;

    public EventLists() {
        //default needed
    }
    public EventLists(String session, String venue, String time) {
        this.session = session;
        this.venue = venue;
        this.time = time;
    }

    public String getSession() {
        return session;
    }

    public String getVenue() {
        return venue;
    }

    public String getTime() {
        return time;
    }
}
