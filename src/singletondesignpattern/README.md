# Singleton Design Pattern

##Intent
A Singleton is creational petter, which describe a way to create object of a class. it has only one object of a class. 


## User case 
Single object of a class globally accessible within a program.


## Example
The class has a private constructor, then constructor can not be called from outside the class. 
declare a variable within the class, this variable refer the one instance of the class. then a public method "getInstance" this will return the instance of the class. it check if instance is null then it will create one and return.


We have also declare a value where value this variable set in constructor while creating an object of the singleton class. We create two instance with different value and if value out is different then single class pattern not fallowed and if same then this is a single class. 