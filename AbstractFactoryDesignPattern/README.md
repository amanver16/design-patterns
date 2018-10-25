# Abstract Factory Design Pattern

The abstract factory design pattern is one of the Creational Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Provide an interface for creating families of related or dependent objects without specifying their concrete classes.  

Below image describes structure of Abstract Factory Pattern  

![Abstract Factory Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Abstract%20Factory%20Design%20Pattern.png)  

**Abstract Factory :**  
Abstract fcatory declares an interface of operations which create abstract product objects.

**Concrete Factory :**  
Concrete Factory implements the operations provided by Abstract Factory interface which creates concrete product objects.

**Abstract Product :**  
Abstract Product declares an interface for a type of product object.

**Concrete Product :**  
Defines a product object to be created by the corresponding concrete factory by implementing the Abstract Product interface.  

**Client :**  
Client only uses interfaces declared by Abstract Product and Abstract Factory.  

## About Project
The project describes how Abstract Factory Pattern works in practical. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

## How to Run
Just compile and run the application using the main class DrinksClient.
