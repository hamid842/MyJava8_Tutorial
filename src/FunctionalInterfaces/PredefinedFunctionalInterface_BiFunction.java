package FunctionalInterfaces;

import java.util.function.BiFunction;

/*
To define lambdas with two arguments, we have to use additional interfaces
that contain “Bi” keyword in their names:
BiFunction, ToDoubleBiFunction, ToIntBiFunction, and ToLongBiFunction.
BiFunction : It represents a function that accepts two arguments and returns a result.
 */
public class PredefinedFunctionalInterface_BiFunction {
    public static void main(String[] args) {
        BiFunction<Person,Person,Integer>biFunction = (p1,p2)->{
            return p1.getAge() + p2.getAge();
        };
        int totalAge = biFunction.apply(
                new Person("Hamid",37),new Person("Mehdi",54));
        System.out.println(totalAge);
    }
}
