package FunctionalInterfaces;
/*
Supplier : Represents a supplier of results.
 */
import java.util.function.Supplier;

public class PredefinedFunctionalInterface_Supplier {
    public static void main(String[] args) {
        Supplier<Person> supplier = ()->{
            return new Person("HAmid" , 37);
        };
        Person p = supplier.get();
        System.out.println("Person Details: "+p.getName()+" , "+p.getAge());
    }
}
