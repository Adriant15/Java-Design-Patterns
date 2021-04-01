# Java Design Patterns

Notes and examples implmenting different design patterns using Java.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This is respository of notes and example of creational design patterns, structural design patterns and behavioral design patterns using Java.
	
## Technologies
Project is created with:

* IntelliJ IDEA 
	
## Setup
Open and run examples files in src folder. 

## Design Patterns

* 

* List entries in bug tracker SQL database and populate HTML table with each bug's information.
* User can add a new bug specifying title, issue description, name of reporter, due date, level of severity. Created date is automatically selected to current date and status of the bug is automatically set to be open.
* Each entry will have two additional options to delete the bug or modify it.
* In the modify menu of a entry, the form is prefilled with information of said entry. User can edit and save any changes made.

## OOP Feature

The strategy design pattern was used to define the different algorithms used to interact with the SQL database, encapsulating one, and making them interchangeable. 

The client application can pass the algorithm to be used, an instance of a concrete strategy class, as a parameter. 

In the bug track project, a context class (SqlCommand) is created with a method execute() that takes an instance of interface type SqlQuery. Inside execute(), an implementing class of interface SqlQuery is also called to run its implementation of execute(). 

Each function to interface with database and updating the HTML pages are defined in a separate class that implements SqlQuery interface and execute(). These are the concrete strategy classes. 

During runtime, a new instance of SqlCommand is created with the parameter being an instance of whichever concrete strategy class is required (polymorphism). 

Advantages:

1.	By encapsulating algorithm separately, new algorithm complying with same interface can easily be added.
2.	Simplifies unit testing because each algorithm is in its own class and can be tested through its interface.
3.	Can test code without worrying about interactions caused by coupling.

## Source

The content is derived from Java Design Patterns by Jason Fedin.
