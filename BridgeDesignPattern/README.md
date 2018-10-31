# Bridge Design Pattern

The bridge design pattern is one of the Structural Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Decouple an abstraction from its implementation so that the two can vary independently. 

Below image describes structure of bridge Pattern  

![Bridge Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Bridge%20Design%20Pattern.png)  

**Abstraction :**  
Defines an abstraction interface which holds a reference of implementor interface.  
It defines higher level operations based on primitive operations of implementor interface.

**Refined Abstraction :**  
Extend or implements the interface defined by the Abstraction to perform some operation.

**Implementor :**  
Defines the interface for concrete implementation classes.  
This interface defines primitive operations or general operations.  

**Concrete Implementor :**  
Defines concrete implementation of Implementor interface.

## About Project
The project describes how Bridge Design Pattern works in practical by using Drinks Factory Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
In this example, we have to generate a cold drink bottle which must be done in two branches of the factory. First branch is responsible for manufacturing the bottle and second branch is responsible for filling up the bottle.

**Solution :**  
1. The two branches must be loosly coupled means they must not depend on each other. 
2. So bridge desing pattern is used to solve this problem.
3. It creates a bridge between the first branch which manufactures the bottle and second branch which fills the bottle to create a final cold drink.

## How to Run 
Just compile and run the application using the main class **DrinksFactory.java**
