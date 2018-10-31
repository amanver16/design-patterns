# Composite Design Pattern

The composite design pattern is one of the Structural Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.  

Below image describes structure of composite pattern  

![Composite Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Composite%20Design%20Pattern.png)  

**Component :**  
Declares the interface for the objects in the composition.  
Implements default behaviour of interface common to all classes.  
Provides a way to manage or access its child components.

**Leaf :**  
Represents leaf objects in the composition.  
A leaf has no children.  
Implements the component and defines the primitive behavior for a component.

**Composite :**  
Defines behavior of components having children i.e. leafs and composites.  
Stores child components.  
Implements child related operations in the component interface.   

**Client :**  
Manipulate objects in the composition tree structure through the component.

## About Project
The project describes how Composite Design Pattern works in practical by using File System Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
In this example, A file system contains files and folders. Further a folder may contain child files or folders. The project uses Composite design pattern to implement this system.  

## How to Run 
Just compile and run the application using the main class **Disk.java**
