package LambdaExpressions.practice.functionalnterface;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        //Convert centigrade to fahrenheit
        Function<Integer , Double> centigradeToFarenhaitInt = x-> new Double((x*9/5)+32);
        System.out.println(centigradeToFarenhaitInt.apply(2));
        //String to integer
        Function<String, Integer> stringIntegerFunction = x-> Integer.valueOf(x);
        System.out.println("String to Int" + stringIntegerFunction.apply(" 4 "));

        Function<PersonEntity, PersonDTO> function = (entity)->{
            return new PersonDTO(entity.getName(),entity.getAge());
        };

        PersonDTO personDTO = function.apply(new PersonEntity("nahid",32));
        System.out.println(personDTO.getName());
        System.out.println(personDTO.getAge());
    }

}
class PersonEntity {
    private String name;
    private int age;

    public PersonEntity(String name, int age) {
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

class PersonDTO {
    private String name;
    private int age;

    public PersonDTO(String name, int age) {
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
