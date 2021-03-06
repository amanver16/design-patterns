# Decorator Design Pattern

The decorator design pattern is one of the Structural Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. 
  
Below image describes structure of decorator pattern  

![Decorator Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Decorator%20Design%20Pattern.jpg)  

**Component :**  
Defines an interface of objects that may have functionalities added/decorated to them dynamically.

**Concrete Component :**  
Defines an object to which additional functionality can be added/decorated.

**Decorator :**  
Defines an interface and holds reference of component to decorate specified features

**Concrete Decorator :**  
Adds/decorates responsibilities to components

## About Project
The project describes how Decorator Design Pattern works in practical by using Phone Manufacturing Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

## How to Run 
Just compile and run the application using the main class **PhoneManufacturer.java**
