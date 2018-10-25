# Builder Design Pattern

The builder design pattern is one of the Creational Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Separate the construction of a complex object from its representation so that the same construction process can create different representations. 

Below image describes structure of Builder Pattern  

![Builder Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Builder%20Design%20Pattern.PNG)  

**Builder :**  
Builder specifies an abstract interface for creating parts of a Product Object.  

**Concrete Builder :**  
Concrete Builder constructs the parts of a concrete product by implementing the builder interface.  

**Director :**  
Director constructs builder interface object and gets the product to be built.

**Product :**  
Product represents the complex object under construction. It builds the product's internal representation and defines the process by which it is assembled.

## About Project
The project describes how Builder Pattern works in practical. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

## How to Run
Just compile and run the application using the main class ComputerClient.
