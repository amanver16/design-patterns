# Command Design Pattern

The command design pattern is one of the Behavioral Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.  

Below image describes structure of command pattern  

![Command Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Command%20Design%20Pattern.png)  

The following diagram shows the object interaction diagram of command pattern :

![Object Interaction Diagram](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Command%20Pattern%20Interaction%20Diagram.jpg)  

**Command :**  
Declares an interface for executing an operation. 

**Concrete Command :**  
Defines a binding between a Receiver object and an action.
Implements Execute by invoking the corresponding operation(s) on Receiver.  

**Client :**  
Creates a ConcreteCommand object and sets its receiver. 

**Invoker :**  
Asks the command to carry out the request. 

**Receiver :**  
Knows how to perform the operations associated with carrying out a request. Any class may serve as a Receiver. 

## About Project
The project describes how Command Design Pattern works in practical by using Smart Tv Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
A smart television performs operation based on commands given by user using a remote.

**Solution :**  
The smart tv application is developed using command pattern which provides simple way to define commands related to smart tv and executes them with the help of an executer.

## How to Run 
Just compile and run the application using the main class **SmartTvUser.java**
