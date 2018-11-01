package com.aman.gof.movietickets.app.susbsystemclasses;

public class SpiCinemas implements MovieTicket {

    @Override
    public void bookTickets(int count, String movieName) {
        System.out.println(count + " tickets booked for movie " + movieName + " in Spi Cinemas.");
    }

}