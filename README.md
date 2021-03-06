# JavaDesignPatterns
Java Design Pattern Essentials

Creational 

	Abstract Factory - Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

	Builder - Separate the construction of an object from its representation so that the same construction process can create different representations.

	Factory Method - Define an interface to create an object, but let subclasses decide which class to instantiate.

	Prototype -  Specify the types of objects to create using a prototypical instance, and create new objects by copying the prototype.

	Singleton - Ensure a class allows only one object to be created, providing a single point of access to it.

Structural -- Help manage how classes are organized and interrelate

	Adapter -  Convert the interface of a class to another interface that clients expect.  Adapter lets classes work together that coiuldn't otherwise because of incompatible interfaces.
	
	Bridge - Decouple an abstraction from its implementation so that each may vary independently.
	
	Composite - Compose objects into tree structures to represent part-whole hierarchies.  Composite lets clients treat individual objects and compositions of objects uniformly. 
	
	Decorator - Attach additional responsibilities to an object dynamically.  Decorators provide a flexible alternative to sub-classing for extending functionality. 
	
	Facade - Provide a useful interface to a set of interfaces in a system.  Facade defines a higher-level interface that makes the subsystem easier to use.
	
	Flyweight - Use sharing to support large numbers of fine-grained objects efficiently.
	
	Proxy - Provide a surrogate or place-holder for another object to control access to it.  (Good for concurrency.)
	
Behavioral -- Help manage what classes actually do

	Chain of Responsibility - Avoid coupling a sender of a request to its receiver by giving more than one object a chance to handle a request.  Chain the receiving objects and pass the request along the chain until an object handles it.
	
	Command - Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests and support undoable operations.   