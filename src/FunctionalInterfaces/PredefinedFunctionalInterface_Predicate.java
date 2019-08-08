package FunctionalInterfaces;

import java.util.function.Predicate;

/*
Predicate : 1- check the condition 2- accept a single parameter 3- evaluate a boolean result
 */
public class PredefinedFunctionalInterface_Predicate {
    public static void main(String[] args) {
        Predicate<Person> predicate = (Person) -> Person.getAge()>28;
        Boolean result = predicate.test(new Person("Hamid" , 29));
        System.out.println(result);
    }
}
class Person {
    private String name ;
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
