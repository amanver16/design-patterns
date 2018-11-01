package com.aman.gof.movietickets;

import com.aman.gof.movietickets.app.facade.MovieTicketBooker;

public class MovieTicketClient {

    public static void main(String[] args) {

        // Use facade to pass the request
        MovieTicketBooker movieTicketBooker = new MovieTicketBooker();

        movieTicketBooker.bookMovieTicket("PVR", 3, "Venom");
        movieTicketBooker.bookMovieTicket("CinePolis", 5, "Avengers: Infinity War");
        movieTicketBooker.bookMovieTicket("SpiCinemas", 2, "Deadpool 2");

    }

}