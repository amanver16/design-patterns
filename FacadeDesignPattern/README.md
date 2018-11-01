# Facade Design Pattern

The facade design pattern is one of the Structural Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higherlevel interface that makes the subsystem easier to use. 

Below image describes structure of composite pattern  

![Facade Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Facade%20Design%20Pattern.png)  

**Facade :**  
Defines a simplified interface to the clients which hides complexity with subsytem classes.  
Client only make use of facade to pass the request and facade picks appropriate subsystem object to handle the request and delagates the request to subsytem object.

**Subsytem Classes :**  
Concrete classes which handle the request coming from facade.  
Have no knowledge of facade so does not keep reference to it.  

## About Project
The project describes how Facade Design Pattern works in practical by using Movie Tickets Booking Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
A client wants to use a simplified application where the client can book movie tickets to whichever screen or cinema it wants. Without a facade pattern the client has to visit each cinema vendor website to book a ticket.

**Solution :**  
Facade pattern provides a simplified interface MovieTicketBooker which just asks client for number of tickets, choose a screen and movie name and does the rest of the work. How movie ticket is booked is not a concern anymore for the client. Facade takes care of it.

## How to Run 
Just compile and run the application using the main class **MovieTicketClient.java**
