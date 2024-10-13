# Factory Method Patter

## Intent
This is a creational pattern that provides a way to create objects without specifying the exact class of the object that will be created. if defines an interface for creating an object but allow subclass to alter the type of the objects that will created.


## User case

When the exact type of object known at runtime. 


## Example

Imagine, that you are creating a notification module in an application that generates different type of notifications. instead of directly instantiating notification we can have factory method.