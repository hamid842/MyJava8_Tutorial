package FunctionalInterfaces;
/*
Consumer :It represents an operation that accepts a single argument and returns no result.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PredefinedFunctionalInterface_Consumer {
    public static void main(String[] args) {
        List<Person>listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person("Hamid",37));
        listOfPerson.add(new Person("Mehdi",88));
        listOfPerson.add(new Person("Sara",47));
        listOfPerson.add(new Person("Zahra",33));
        listOfPerson.add(new Person("Mohsen",22));
        listOfPerson.forEach((person) -> {
            System.out.println("Person name : "+person.getName());
            System.out.println("Person age : "+person.getAge());
        });
        Consumer<Person> consumer = (Person) -> {
            System.out.println(Person.getName());
            System.out.println(Person.getAge());
        };
        consumer.accept(new Person("Nahid",32));
    }
}
