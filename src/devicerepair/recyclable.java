
package devicerepair;

import java.util.ArrayList;

/*
- The interface in Java is a mechanism to achieve abstraction, you define a set of behaviours that a subclass will implement
- Methods are by default abstract and public
- Variables are by default public, static and final (final is a constant)
- Like abstract classes, interfaces cannot be used to create objects
- An interface cannot contain a constructor (as it cannot be used to create objects)
- Interface methods do not have a body - the body is provided by the class that implements it
- On implementation of an interface, you must override all its methods
- An interface can have static methods. Static methods in a Java interface must have implementation
- It is possible for a Java interface to inherit from another Java interface, means that if a class implements Subclass Interface, that class has to implement all methods defined in both interfaces
- The point of it - Reduces dependency on implementation specifics and makes code more reusable
*/

public interface recyclable {
       
    ArrayList<String> isRecyclable();
    
}
