# Iterator Design Pattern

The iterator design pattern is one of the Behavioral Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation. 

Below image describes structure of iterator pattern  

![Iterator Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Iterator%20Design%20Pattern.jpg)  

**Iterator :**  
Defines an interface for accessing and traversing elements. 

**Concrete Iterator :**  
Implements the Iterator interface.  
Keeps track of the current position in the traversal of the aggregate. 

**Aggregate :**  
Defines an interface for creating an Iterator object. 

**Concrete Aggregate :**  
Implements the Iterator creation interface to return an instance of the proper ConcreteIterator. 

## About Project
The project describes how Iterator Design Pattern works in practical by using Friends Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
To iterate an array of friends using iterator pattern.

## How to Run 
Just compile and run the application using the main class **IteratorTest.java**
