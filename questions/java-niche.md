## Java Niches


1. What is java?

2. What is meant by platform independence of Java?
    * Has a large library of useable code and an execution evirionment Java Virtual Machine

3. What is the JVM?
    * JVM stands for Java Virtual Machine
        * converts bytecode to machine specific code.
        * Provides memory managment, garbage collection.
        * Provides an interface that does not depend on the operating system

4. What is the difference between JDK and JVM?
    * JDK stands for Java Development Kit
        * the tools, language, etc.
        * JVM is part of the JDK 
    * JVM stands for Java Virtual Machine.
        * is the machine that allows Java to run anywhere

5. What is the difference between JVM and JRE?
    * JVM stands for Java Virtual Machine
        * provides platform independence by changing bytecode
    * JRE stands for Java Runtime Environment
        * allows java programs to be ran in an isolated (virtualized) environemnt

6. Which class is the superclass of all classes?
    * `Object` is the superclass of all other java classes.

7. Why Java doesn't support multiple inheritance?
    * multiinheritance can create inexplicit overriding of methods; making behavior unexpected or less predictable.

8. Why is Java not a pure Object Oriented language?
    * Because primitives are not objects, the language is not considered a _pure_ OOP language.

10. What is the importance of `main` method in Java?
    * The `main` method is used to start the program in JVM.

13. Can we overload the `main` method?
    Yes

13. Can we have multiple classes in a java source file?
    * One `.java` file can consist of multiple classes with the restriction that only one class can be `public`.

14. What is a Java Package and which package is imported by default?
    * Java package is an encapsulated group of classes, subclasses, and interfaces.
    * `java.lang` is imported by default.
        * It provides classes that are needed to the design of Java programming

15. What are the access modifiers?
    * An access modifier restricts the access of a class, constructor, data member and method in another class. `public` - all subclasses have access.
    `private` - scope is limited to the class itself.
    `protected` - only access available to classes and subclasses in that package.
    `Default` - only accessed by those in the package only

16. What is the `final` keyword?
    * `final` variable is a constant; It cannot be re-assigned a value.
    * `final` method is a cannot be overridden
    * `final` class cannot be extended

17. What is the `static` keyword?
    * `static` member is a variable or method which operates independent of the **state** of the class that it is defined in; an instance of the class does not need to be created to access a `static` member.

18. Can we declare a class as `static`?
    * Only if the class is nested within another.
    * Outer-most-classes cannot be static

18. What is `finally` and `finalize` in java?
    * `finally` - code will be ran whether an exception is handled or not.
    * `finalized()` - is the method called by any object before it is garbage collected

19. What is a multi-catch block in java?
    * A `try`/`catch` block with multiple `catch` blocks, each specifying how to handle a distinct exception-type.



26. What is an `Enum` in Java?
    * A special class that represents a group of constants (unchangeable variables, like final variables)
