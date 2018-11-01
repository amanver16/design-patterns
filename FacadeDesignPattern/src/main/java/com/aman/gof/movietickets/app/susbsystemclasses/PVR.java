package com.aman.gof.movietickets.app.susbsystemclasses;

public class PVR implements MovieTicket {

    @Override
    public void bookTickets(int count, String movieName) {
        System.out.println(count + " tickets booked for movie " + movieName + " in PVR.");
    }

}