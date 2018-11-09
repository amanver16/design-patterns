# Mediator Design Pattern

The mediator design pattern is one of the Behavioral Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently. 

Below image describes structure of mediator pattern  

![Mediator Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Mediator%20Design%20Pattern.png)  

**Mediator :**  
Defines an interface for communicating with Colleague objects.

**Concrete Mediator :**  
Implements cooperative behavior by coordinating Colleague objects.  
Knows and maintains its colleagues.

**Colleague :**  
Defines an interface for concrete colleagues operations. 

**Concrete Colleague :**  
Each Colleague class knows its Mediator object.  
Each colleague communicates with its mediator whenever it would have otherwise communicated with another colleague.

## About Project
The project describes how Mediator Design Pattern works in practical by using Counter Strike Radio Chat Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement And Solution :**  
In the game of counter strike, in a round, a teammate or player can send radio commands to other teammates or players. A player does not directly communicate with other player.  A player sends a radio command using special combination of keys and other players can hear the radio command sent by the player. So to implement this, I have used mediator pattern. Here Radio Command is our mediator and the players are colleagues.

## How to Run 
Just compile and run the application using the main class **CounterStrikeRadioChat.java**
