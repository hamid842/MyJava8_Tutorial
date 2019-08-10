package LambdaExpressions.practice.functionalnterface;

import java.util.function.Predicate;

public class PredicateExam {
    public static void main(String[] args) {
        Predicate<Person> personPredicate = (person -> person.getAge() > 28);
        boolean result = personPredicate.test(new Person("Arsalan",20));
        System.out.println(result);
    }
}
