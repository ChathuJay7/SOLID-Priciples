# SOLID Principles

SOLID principles are object oriented design (OOD) concepts relevant to software development. SOLID is a structured design approach that ensures your software is modular and easy to maintain, understand, debug and refactor. SOLID helps save time and effort in both development and maintenance and also prevents your code from becoming rigid and fragile, which helps you build long-lasting software. There are so many benefits of using OOD but every developer should also have the knowledge of the SOLID principle for good object-oriented design in programming. The SOLID principle helps in reducing tight coupling. Tight coupling means a group of classes are highly dependent on one another which you should avoid in your code. Opposite of tight coupling is loose coupling and your code is considered as a good code when it has loosely-coupled classes. Loosely coupled classes minimize changes in your code.

- S - Single Responsibility Principle (SRP)
- O - Open Closed Principle (OCP)
- L - Liskov’s Substitution Principle (LSP)
- I - Interface Segregation Principle (ISP)
- D - Dependency Inversion Principle (DIP)

## Single Responsibility Principle

- Each class should be responsible for a single part or functionality of the system. A class should have only one reason to change.
- SRP aims to separate behaviours so that if bugs arise as a result of your change, it won’t affect other unrelated behaviours.

## Open Closed Principle

- Software components should be open for extension, but not for modification. It tells to write code that able to add new functionality without changing the existing source code. OCP brings the benefit of not testing the already written and tested code when add new functionality. 
- OCP aims to extend a Class’s behaviour without changing the existing behaviour of that Class. This is to avoid causing bugs wherever the Class is being used.

## Liskov’s Substitution Principle

- Objects of a superclass should be replaceable with objects of its subclasses without breaking the system. If S is a subtype of T, then object of type T may be replaced with objects of type S without altering any of the desirable properties of the program. Functions that use references to base classes must be able to use  objects of the derived class without knowing it.
-  LSP aims to enforce consistency so that the parent Class or its child Class can be used in the same way without any errors.

## Interface Segregation Principle

- No client should be forced to depend on methods that it does not use. It reduce the side effect and frequency of required changes by splitting the software in to multiple independent parts. 
- ISP aims at splitting a set of actions into smaller sets so that a Class executes only the set of actions it requires.
  
## Dependency Inversion Principle

- High-level modules should not depend on low-level modules, both should depend on abstractions. Abstraction should not depend on abstraction.
- DIP aims at reducing the dependency of a high-level Class on the low-level Class by introducing an interface.