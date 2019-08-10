package LambdaExpressions.practice.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionComparator {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("saghar",8));
        personList.add(new Person("hanan",5));
        personList.add(new Person("nahid",32));
        personList.add(new Person("amir",31));
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(personList, comparator);
        for (Person person: personList){
            System.out.println(person.getName());
        }
        //withLambda
        Collections.sort(personList, (Person o1 ,Person o2)->{
            return o1.getAge() - o2.getAge();
        } );
        personList.forEach((person)-> System.out.println(person.getName()));
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}