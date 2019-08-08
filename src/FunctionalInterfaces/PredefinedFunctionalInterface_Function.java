package FunctionalInterfaces;

import java.util.function.Function;

/*
Function : It represents a function that accepts one argument and returns a result.
 */
public class PredefinedFunctionalInterface_Function {
    public static void main(String[] args) {
        //convert centigrade to fahrenheit
        Function<Integer,Double>centigradeToFahrenheitInt = x -> (new Double(x*9/5)+32);
        // string to integer
        Function<String,Integer>stringToInt = x->Integer.valueOf(x);
        System.out.println("String to Int :" +stringToInt.apply("4"));

        Function<PersonEntity , PersonDTO>function = (entity)-> {
            return new PersonDTO(entity.getName(),entity.getAge());
        };
        PersonDTO personDTO = function.apply(new PersonEntity("Hamid" , 37));
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