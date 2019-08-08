package FunctionalInterfaces;
/*
1- An Interface that contains exactly one abstract method is known as a functional interface.
2- It can have any number of default, static methods but can contain only one abstract method.
 It can also declare methods of the object class.
3- Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
 It is a new feature in Java 8, which helps to achieve a functional programming approach.
4- A functional interface can extend another interface only when it does not have any abstract method.
5- The Java API has many one-method interfaces such as Runnable, Callable, Comparator,
ActionListener, and others. They can be implemented and instantiated using anonymous class syntax.
 */
@java.lang.FunctionalInterface   // annotation is mendatory
interface sayable {
     void say(String message);   // abstract method
}

public class FunctionalInterface {
    public static void main(String[] args) {
        sayable sayable = message -> {
            System.out.println(message);
        };
        sayable.say("say somthing ...");
    }
}
