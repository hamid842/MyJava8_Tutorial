package LambdaExpressions.practice.functionalnterface;

import java.util.function.Supplier;

public class SuppliersExam {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> {
            return new Person("nahid",32);
        };
    Person person = supplier.get();
        System.out.println(person.getName() +" and "+ person.getAge());
    }
}
