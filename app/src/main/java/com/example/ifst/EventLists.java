package com.example.ifst;

public class EventLists {
    private String session;
    private String venue;
    private String time;
    private  String coordinator;

    public EventLists() {
        //default needed
    }

    public EventLists(String session, String venue, String time, String coordinator) {
        this.session = session;
        this.venue = venue;
        this.time = time;
        this.coordinator = coordinator;
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

    public String getCoordinator() {
        return coordinator;
    }
}
