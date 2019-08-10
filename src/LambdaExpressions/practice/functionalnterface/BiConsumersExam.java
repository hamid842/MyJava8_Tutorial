package LambdaExpressions.practice.functionalnterface;

import java.util.function.BiConsumer;

public class BiConsumersExam {
    public static void main(String[] args) {
        BiConsumer<Person, Person> biConsumer = (p1, p2) -> {
            System.out.println("print first Person");
            System.out.println(p1.getName());
            System.out.println("print second Person");
            System.out.println(p2.getName());
        };
        biConsumer.accept(new Person("sara", 25), new Person("samira", 43));
    }
}
