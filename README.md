# Java Design Patterns

Notes and examples implmenting different design patterns using Java.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Comparison](#Comparison)

## General info
This is repository of notes and example of creational design patterns, structural design patterns and behavioural design patterns using Java.

Goals of design pattern are to:

* Less coupling, high cohesion
* Less maintenance and more extensibility
* Reduce duplications
* Program to interface and avoid passing concrete classes
* Encapsulate object creation
* Code to abstraction and decouple client code from actual implementations
	
## Technologies
Project is created with:

* IntelliJ IDEA 
	
## Setup
Open and run examples files in src folder. 

## Design Patterns

* Creational Design Patterns
	- Factory Method
		- The factory pattern is used to replace class constructors, abstracting the process of object generation so that the type of the object instantiated can be determined at run-time.
		- Handle details of object creation.
	- Abstract Factory Method
		- The abstract factory pattern is used to provide a client with a set of related or dependant objects. 
		- The "family" of objects created by the factory are determined at run-time.
		- "Factory of factories"
	- Singleton (Bill Pugh Approach)
		- The singleton pattern ensures that only one object of a particular class is ever created. 
		- All further references to objects of the singleton class refer to the same underlying instance.
		- Bill Pugh Approach is thread safe and only create instance when needed
	- Builder
		- The builder pattern is used to create complex objects with constituent parts that must be created in the same order or using a specific algorithm. 
		- An external class controls the construction algorithm.
		- Construction of attributes of an objects in parts.
	- Prototype
		- The prototype pattern is used to instantiate a new object by copying all of the properties of an existing object, creating an independent clone. 
		- This practise is particularly useful when the construction of a new object is inefficient.
		- Create objects from clones of cashe objects.

* Structural Design Patterns
	- Adapter
		- The adapter pattern is used to provide a link between two otherwise incompatible types by wrapping the "adaptee" with a class that supports the interface required by the client.
		- Converts interface of an class into another interface that clients expects.
	- Bridge
		- The bridge pattern is used to separate the abstract elements of a class from the implementation details, providing the means to replace the implementation details without modifying the abstraction.
		- One class is injected another class to be used.
	- Composite
		- The composite pattern is used to create hierarchical, recursive tree structures of related objects where any element of the structure may be accessed and utilised in a standard manner.
		- Root and nodes have similar functions and can be treated/used the same way.
		- No need to to build class for each level of the hierarchy.
	- Facade
		- The facade pattern is used to define a simplified interface to a more complex subsystem.
		- No additional function or behaviours added.
	- Decorator
		- The decorator pattern is used to extend or alter the functionality of objects at run-time by wrapping them in an object of a decorator class. 
		- Decorator class takes in object and add in specific behaviour for that object.
	- Flyweight
		- The flyweight pattern is used to reduce the memory and resource usage for complex models containing many hundreds, thousands or hundreds of thousands of similar objects.
		- Use a factory to create "virtual instances" of objects from hash table. 
		- Each "virtual instance" object can have different attributes.
	- Proxy
		- The proxy pattern is used to provide a surrogate or placeholder object, which references an underlying object. 
		- Provide placeholder for another object to control access.
		- Used when we want to provide controlled acces of a functionality.

* Behavioural Design Patterns
	- Chain of Responsibility
		- The chain of responsibility pattern is used to process varied requests, each of which may be 	dealt with by a different handler.
		- Each object passes parameter to next in chain until it's resolved
		- Each class in the chain points to the next class to handle the request.
	- Command
		- The command pattern is used to express a request, including the call to be made and all of its required parameters, in a command object. 
		- The command may then be executed immediately or held for later use.
		- Requests are given to specific object to handle.
	- Interpreter
		-  The interpreter pattern is used to define the grammar for instructions that form part of a language or notation, whilst allowing the grammar to be easily extended.
	- Iterator
		- The iterator pattern is used to provide a standard interface for traversing a collection of items in an aggregate object without the need to understand its underlying structure.
		- Implements first(), next(), isDone() and currentItem() method. 
	- Mediator
		-  The mediator pattern is used to reduce coupling between classes that communicate with each other. 
		- Instead of classes communicating directly, and thus requiring knowledge of their implementation, the classes send messages via a mediator object.
	- Memento
		- The memento pattern is used to capture the current state of an object and store it in such a manner that it can be restored at a later time without breaking the rules of encapsulation.
		* Data is saved to a memento object and mento objects are saved to a list.
		* List can accessed to return to any previous saved states.
	- Observer
		- The observer pattern is used to allow an object to publish changes to its state. 
		- Other objects subscribe to be immediately notified of any changes.
		- Objects can add/remove observers from list.
	- State
		- The state pattern is used to alter the behaviour of an object as its internal state changes. 
		- The pattern allows the class for an object to apparently change at run-time.
		* Each state represented by one class.
		* Each state object is passed to the context object and the behaviours of the state object is used.
	- Strategy
		- The strategy pattern is used to create an interchangeable family of algorithms from which the required process is chosen at run-time.
		- The pattern allows the class for an object to apparently change at run-time.
		- Each strategy is represented by one class.
		- Object method will take in a strategy object along with one or more identical parameters which the strategy object will operate on.
	* - Template Method
		- The template method pattern is used to define the basic steps of an algorithm and allow the implementation of the individual steps to be changed.
		- Template class contains abstract methods that subclasses will implement as well as final methods that are common to all subclasses.
	* Visitor
		- The visitor pattern is used to separate a relatively complex set of structured data classes from the functionality that may be performed upon the data that they hold.
		- Each visitor class will have specific behaviours.
		- In client, visitor objects are passed to an object, method inside the object will pass itself to the visitor and the visitor will operate on the object.

## Comparison

-	Mediator vs Observer
	+	Observer: distributes communication by introducing Observer and Subject objects.
	+	Mediator: a mediator object encapsulate communication between other objects.

* Adapter vs Bridges:
 
 * Adapter: make unrelated classes work together, usually applies to systems after they have been designed
 * Bridge: applied is used up-front

* Facade vs Adapter vs. Decorator:
 
 * Facade: simplify and unify large interface or complex set of interfaces, no new behaviours or responsibilities add.
 * 
 Adapter: make unrelated classes work together, usually applies to systems after they have been designed
 * 
  Decorator: wraps an object to add new behaviours and responsibilities.
 
* Chain of Responsibility vs Command:
 * - Chain of Responsibility: forward a request along a chain of objects without hope that any one of the objects along will handle the request.
 * - Command: request forwarded to specific object to handle.

* Strategy vs. State Pattern:

 * Strategy: subclasses decide how to implement steps in algorithm. strategy is passed as an argument to method and context object does not have any variable to store it.
 * State: alternative to putting lots of conditionals in your context. Encapsulate interchangeable behaviours and use delegation to decide which behaviour to use.

* Strategy vs. Template Method:

 * Strategy: subclasses decide how to implement steps in algorithm. strategy is passed as an argument to method and context object does not have any variable to store it.
 * State: alternative to putting lots of conditionals in your context. Encapsulate interchangeable behaviors and use delegation to decide which behaviour to use.

- Strategy vs Template Method:
 *  Strategy: subclasses decide how to implement steps in algorithm. strategy is passed as an argument to method and context object does not have any variable to store it.
 *  Template Method: Encapsulate algorithms by inheritance.

## Source

The content is derived from Java Design Patterns by Jason Fedin.
