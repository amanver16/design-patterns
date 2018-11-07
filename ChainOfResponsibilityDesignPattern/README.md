# Chain of Responsibility Design Pattern

The chain of responsibility design pattern is one of the Behavioral Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it. 

Below image describes structure of chain of responsibility pattern  

![Chain of Responsibility Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Chain%20of%20Responsibility%20Design%20Pattern.PNG)  

The following diagram shows the object structure of chain of responsibility pattern :

![Object Structure](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Chain%20of%20Responsibility%20Object%20Structure.jpg)  

**Handler :**  
Defines an interface  for handling requests.  
Implements the successor link. (Optional)  

**Concrete Handler :**  
Handles requests it is responsible for.  
Can access its successor.  
If the ConcreteHandler can handle the request, it does so; otherwise it forwards the request to its successor. 

**Client :**  
Initiates the request to a ConcreteHandler object on the chain. 

## About Project
The project describes how Chain of Responsibility Design Pattern works in practical by using Counter Strike Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
In counter strike game the terrorist mission is to plant the bomb. The bomb carrier can be any player. To determine which player will plant the bomb we can use Chain of Responsibility design pattern.

**Solution :**  
Using Chain of Responsibility pattern we can create a chain of players object and pass the request to plant the bomb. The objects in the chain handle the request, they check if they are the bomb carrier then they plant the bomb (handling the request), otherwise they pass the request to next player.

## How to Run 
Just compile and run the application using the main class **ApnaDesiServer.java**
