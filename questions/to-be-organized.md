## Questions to be Organized Later

9. What is difference between path and classpath variables?
    * path variables deal with the PATH environment and allow the OS to run the executable from any directory.
    * Classpath variables is a system environment variable used by the Java compiler and JVM


24. Can an interface implement or extend another interface?
    * Yes, an interface can extend another interface.
    * An interface cannot `implement` another interface, because it would imply that it would be _defining_ a method. An interface is used to _declare_ method signatures. An interface which `extends` another interface, inherits the declared method signatures and defers the definition to the implementing subclass.

27. What are Java Annotations?
    * Annotations are used to provide supplement information about a program.
    * Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.

28. What is the Java Reflection API?
    * Java Reflection makes it possible to inspect classes, interfaces, fields and methods at runtime, without knowing the names of the classes, methods etc. at compile time.
    * It is also possible to instantiate new objects, invoke methods and get/set field values using reflection.

31. How can one sort a collection of custom Objects in Java?
    * `Collections.sort`

35. What are different types of classloaders?

32. What is inner class in java?

33. What is anonymous inner class?
34. What is the Classloader in Java?
36. What is ternary operator in java?
37. What does super keyword do? Used by the subclass to call a method defined in the superclass
38. What are break and continue statement used for? When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop. The continue keyword can be used in any of the loop control structures. It causes the loop to immediately jump to the next iteration of the loop.
39. What is the this keyword used for? Refers to the variable of the current object
40. What is a default constructor? A null constructor? Default means there are no arguments
41. Can we have try block without a catch block? Yes,  we can have try without catch block by using finally block.
You can use try with finally. As you know finally block always executes even if you have exception or return statement in try block except in case of System.exit().
42. What is Garbage Collection? Memory management when an object is no longer being called by a program
43. What is Serialization and Deserialization? Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.
44. How does one run a JAR file through command prompt?
45. What is the use of System class, name an example? System class are standard input, standard output, and error output streams; access to externally defined properties and environment variables; a means of loading files and libraries; and a utility method for quickly copying a portion of an array. It extends class Object.
46. What is instanceof keyword? It is a binary operator used to test if an object (instance) is a subtype of a given Type.
47. Can we use String with switch case? Yes, since Java 7
48 .Is Java a Pass-by-Value or Pass-by-Reference language? Explain the difference? Pass by Value Pass by Value: The method parameter values are copied to another variable and then the copied object is passed, that’s why it’s called pass by value. Pass by Reference: An alias or reference to the actual parameter is passed to the method, that’s why it’s called pass by reference.
49. What is the difference between Heap and Stack Memory? The main difference between heap and stack is that stack memory is used to store local variables and function call while heap memory is used to store objects in Java.

#### Loops
1. Describe the features of Java for controlling the repeated execution of a block of code.
2. Show how general uses of for, while and do could all be emulated using only loops that start of while (true).

#### Exception
1. Describe some circumstances where it is useful for functions to return errors as exception, and some where it is not. Give an example of an algorithm which is simplified by the use of exceptions.



* List the eight Java primitive data types. Boolean, char, int, short, byte, long, float, double
* What is a class?  Templates that are used to create objects, and to define object data types and methods.
* Name the java access modifies for instance variable, classes and methods. Private, protected, default, public
* What can an abstract class do that an interface cannot? Have final and non-final variables as well as abstract and non-abstract methods
* What result will be printed if the following fragment of Java code is executed? Why?
		System.out.println('h'+'e'+"llo worl"+'d')
* What result will be printed if the following fragment of Java code is executed? Why? 

```java
public static void main(String[] args) {
    double d = 6.6;
    try {
        d=1.0/0.0; 
    } finally {
        System.out.println("d = " + d);
    }
}
```