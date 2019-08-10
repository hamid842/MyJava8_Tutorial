package LambdaExpressions.practice.functionalnterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumersExam {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("saghar", 8));
        people.add(new Person("hanan", 5));
        people.add(new Person("amir", 31));
        people.add(new Person("nasrin", 31));
        people.forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        Consumer<Person> consumer = (person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        };
        consumer.accept(new Person("Ramesh", 30));
    }
}

