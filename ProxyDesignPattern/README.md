# Proxy Design Pattern

The proxy design pattern is one of the Structural Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Provide a surrogate or placeholder for another object to control access to it. 

Below image describes structure of proxy pattern  

![Proxy Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Proxy%20Design%20Pattern.png)  

The following object diagram shows how proxy pattern works: 

![Object Diagram](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Proxy%20Object%20Diagram.jpg)  

**Proxy :**  
Maintains a reference of real subject that lets the proxy access the real subject.  
Proxy may refer to a Subject if the RealSubject and Subject interfaces are the same.  
Provides an interface identical to Subject's so that a proxy can by substituted for the real subject.  
Controls access to the real subject and may be responsible for creating and deleting it.  
Other responsibilities depend on the kind of proxy:  

** Remote proxy:** Remote proxy is responsible for encoding a request and its arguments and for sending the encoded request to the real subject in a different address space.  
** Virtual Proxy:** Virtual Proxy may cache additional information about the real subject so that they can postpone accessing it. For example, the CsGoProxy used in the example project caches the real CsGo's extent.  
** Protection proxy:** Protection Proxy checks that the caller has the access permissions required to perform a request. 

**Subject :**  
Defines the common interface for RealSubject and Proxy so that a Proxy can be used anywhere a RealSubject is expected. 

**Real Subject :**  
Defines the real object that the proxy represents. 

## About Project
The project describes how Proxy Design Pattern works in practical by using Steam Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
Steam is a platform for launching, playing, purchasing, selling various games, softwares, tools etc. The project explains how proxy pattern works to launch the game Counter Strike: Global Offensive from the steam client. Imagine a situation where instance of CS Go is created whenever steam client is launched. The Cs Go will also launch everytime we open steam. We don't want that.

**Solution :**  
Proxy pattern defines a proxy for the game CS GO and steam client uses the proxy to launch the CS Go game. That means proxy is responsible for creating intance of Cs Go

## How to Run 
Just compile and run the application using the main class **SteamClient.java**
