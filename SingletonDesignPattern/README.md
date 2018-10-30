# Singleton Design Pattern

The singleton design pattern is one of the Creational Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Ensure a class only has one instance, and provide a global point of access to it. 

Below image describes structure of Singleton Pattern  

![Singleton Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Singleton%20Design%20Pattern.jpg)  

**Singleton :**  
Defines an Instance operation that lets clients access to its unique instance.  
Responsible for creating its own instance.

## About Project
The project describes how Singleton Design Pattern works in practical by using Student Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

The Singleton Pattern provide many ways to create a singleton instance:

1. Eager Initialization 
2. Static Block Intialization
3. Lazy Initialization
4. Thread Safe Initialization
5. Double Check Locking
6. Bill Pugh Singleton
7. Enum Singleton

The project contains examples of all above mentioned methods with description.

## How to Run
Create the required tables.  
Change the credentials related to database in *src/main/resources/connection.properties* file.  
Just compile and run the application using the main class **StudentClient.java**
