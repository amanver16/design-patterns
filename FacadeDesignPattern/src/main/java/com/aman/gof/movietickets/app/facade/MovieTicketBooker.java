package com.aman.gof.movietickets.app.facade;

import com.aman.gof.movietickets.app.susbsystemclasses.CinePolis;
import com.aman.gof.movietickets.app.susbsystemclasses.PVR;
import com.aman.gof.movietickets.app.susbsystemclasses.SpiCinemas;

/**
 * This class defines a facade which passes client request to the subsystem
 * classes based on which subsytem class can handle the client request
 */
public class MovieTicketBooker {

    public void bookMovieTicket(String screenName, int noOfTickets, String movieName) {

        if ("PVR".equalsIgnoreCase(screenName)) {
            PVR pvr = new PVR();
            pvr.bookTickets(noOfTickets, movieName);
        } else if ("CinePolis".equalsIgnoreCase(screenName)) {
            CinePolis cinePolis = new CinePolis();
            cinePolis.bookTickets(noOfTickets, movieName);
        } else if ("SpiCinemas".equalsIgnoreCase(screenName)) {
            SpiCinemas spiCinemas = new SpiCinemas();
            spiCinemas.bookTickets(noOfTickets, movieName);
        }

    }

}