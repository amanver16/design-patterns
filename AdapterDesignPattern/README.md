# Adapter Design Pattern

The adapter design pattern is one of the Structural Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.  

Below image describes structure of adapter Pattern  

![Adapter Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Adapter%20Design%20Pattern.jpg)  

**Target :**  
Defines an interface which client expects and uses.

**Client :**  
A class which ollaborate with object of target interface using adaptor to perform operations required.

**Adaptee :**  
Defines existing/source interface which is going to adapt target interface.

**Adapter :**  
Defines a class which adpats the interface of adaptee to the target interface.

## About Project
The project describes how Adaptor Design Pattern works in practical by using Editor Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
Suppose we have an interface IDE contains method to edit java files. Now we need another interface which can compile that particular file. But both interfaces are incompatible to each other. So, we are going to use Adapter Design Pattern.

**Solution :**  
1. Define a adapter (IdeToCompilerAdapter) which can convert IDE interface to Compiler interface to make them compatible with each other.
2. Now the client (VsCode) uses this adapter to perform compile operation.

## How to Run 
Just compile and run the application using the main class **AdapterPatternDemo.java**
