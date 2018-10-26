# Factory Method Design Pattern

The factory method design pattern is one of the Creational Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses. 

Below image describes structure of Factory Method Pattern  

![Factory Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Factory%20Method%20Design%20Pattern.png)  

**Product :**  
Defines the interface of objects that factory method creates.  

**Concrete Product :**  
Defines the concrete products by implementing Product interface.  

**Creator :**  
Creator defines an abstarct class or interface or a simple class which contains factory method which returns Object of type Product. Creator may also contain implementation of factory method which returns object of type concrete product. It can also call the factory method to create an object of type Product.

**Concrete Creator :**  
Defines a class which overrides the factory method defined in Creator class and creates an instance of concrete products.

## About Project
The project describes how Factory Pattern works in practical by using Vending Machine Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

## How to Run
Just compile and run the application using the main class **Customer.java**
