package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression_Comparator {
    public static void main(String[] args) {
        List<Person> listOfPerson = new ArrayList<>();

        listOfPerson.add(new Person("Hamid", 37));
        listOfPerson.add(new Person("Hadi", 25));
        listOfPerson.add(new Person("Mehdi", 14));
        listOfPerson.add(new Person("Ahmad", 50));

        // sort of list without lambda
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        };
        Collections.sort(listOfPerson, comparator);
        System.out.println("Sort persons by age in ascending order :");
        for (Person person : listOfPerson) {
            System.out.println("Person name :" + person.getName());
        }
        // sort list by age with lambda
        Collections.sort(listOfPerson, (Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        });
        System.out.println("Sort persons by age in ascending order :");
        listOfPerson.forEach(
                (person) -> System.out.println("Person name :" + person.getName()));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
