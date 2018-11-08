# Interpreter Design Pattern

The interpreter design pattern is one of the Behavioral Design Pattern as described in the original GOF [book](https://github.com/amanver16/ebooks_cheatsheets/blob/master/PDF/Design%20Patterns%20-%20Elements%20of%20Reusable%20Object%20Oriented%20Software%20-%20GOF.pdf)

> Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.   

Below image describes structure of interpreter pattern  

![Interpreter Design Pattern](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Interpreter%20Design%20Pattern.png)  

**Abstract Expression :**  
Declares an abstract Interpret operation that is common to all nodes in the abstract syntax tree. 

**Terminal Expression :**  
Implements an Interpret operation associated with terminal symbols in the grammar.  
An instance is required for every terminal symbol in a sentence. 

**Non-Terminal Expression :**  
One such class is required for every rule _R ::= R1 R2 ... Rn_ in the grammar.  
Maintains instance variables of type AbstractExpression for each of the symbols _R1_ through _Rn_.  
Implements an Interpret operation for nonterminal symbols in the grammar. Interpret typically calls itself recursively on the variables representing _R1_ through _Rn_. 

**Context :**  
Contains information that's global to the interpreter.  

**Client :**  
Builds (or is given) an abstract syntax tree representing a particular sentence in the language that the grammar defines.
The abstract syntax tree is assembled from instances of the NonterminalExpression and TerminalExpression classes.  
Invokes the Interpret operation.  

## About Project
The project describes how Interpreter Design Pattern works in practical by using Calculator Application. Remember it is not recommended to fully implement a design pattern as it is, the implementation of a design pattern fully depends upon the use cases of the project. A design pattern if applied at wrong place can mess with the whole application.  

**Problem Statement :**  
To implement a simple calculator which solves simple regular expressions.

## How to Run 
Just compile and run the application using the main class **Calculator.java**
