package LambdaExpressions.practice.functionalnterface;

import java.util.function.BiFunction;

public class BiFunctionExam {
    public static void main(String[] args) {
        BiFunction<Person, Person, Integer> biFunctionExam = (p1, p2) -> {
            return p1.getAge() + p2.getAge();
        };
        int totalAge = biFunctionExam.apply(new Person("Sarah", 20),
                (new Person("Sahar", 23)));
        System.out.println(totalAge);
    }
}
