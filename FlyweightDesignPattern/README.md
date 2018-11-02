# Flyweight Design Pattern

The flyweight design pattern is one of the Behavioral Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Use sharing to support large numbers of fine-grained objects efficiently. 

Below image describes structure of flyweight pattern  

![Flyweight Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Flyweight%20Design%20Pattern.jpg)  

The following object diagram shows how flyweights are shared: 

![Object Diagram](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Flyweight%20Object%20Diagram.jpg)  

**Flyweight :**  
Defines an interface through which flyweights can recieve and act on extrinsic state

**Concrete Flyweight :**  
Implements the flyweight interface and adds dtorage for intrinsic state, if any.  
A concrete flyweight must be sharable.  
Any state it stores must be intrinsic, which means, it must be independent of the concrete flyweight's context.  

**Unshared Concrete Flyweight :**  
Not all Flyweight subclasses need to be shared.  
The Flyweight interface enables sharing; it doesn't enforce it.  
It's common for UnsharedConcreteFlyweight objects to have ConcreteFlyweight objects as children at some level in the flyweight object structure.

**Flyweight Factory :**  
Creates and manages flyweight objects.  
Ensures that flyweights are shared properly.  
When a client requests a flyweight, the FlyweightFactory object supplies an existing instance or creates one, if none exists. 

## About Project
The project describes how Flyweight Design Pattern works in practical by using Counter Strike Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
In counter strike game there are two teams terrorist and counter terrorist. Terrosrist job is to kill the counter terrorist and main objective is to plant the bomb. The counter terrorist job is to defuse the bomb or kill the terrorist. Both teams can choose any choice of weapon. But main objective of their team is fixed i.e. plant the bomb or defuse the bomb. So to implement this we can define two classes representing T and CT. Suppose there are 5 players in each team. So to play the game we need to create 5 T and 5 CT object. This is costly and memory consuming process.

**Solution :**  
Flyweight pattern provides a way to minimize object creation. So the project follows this pattern and demonstrates the object reusibility of objects.

## How to Run 
Just compile and run the application using the main class **CounterStrike.java**
