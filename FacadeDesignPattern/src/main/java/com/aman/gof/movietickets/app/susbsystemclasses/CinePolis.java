package com.aman.gof.movietickets.app.susbsystemclasses;

/**
 * This class is a part of movie tickets subsystem. This class has no knowledge
 * of facade (MovieTicketBooker) so does not keep reference to it. Facade passes
 * client request to these subsytem classes
 */
public class CinePolis implements MovieTicket {

    @Override
    public void bookTickets(int count, String movieName) {
        System.out.println(count + " tickets booked for movie " + movieName + " in Cine Polis.");
    }

}