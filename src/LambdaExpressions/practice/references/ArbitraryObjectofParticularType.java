package LambdaExpressions.practice.references;
import java.util.ArrayList;
import java.util.Arrays;

public class ArbitraryObjectofParticularType {
    public static void main(String[] args) {
        String[] array = {"Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda"};
     Arrays.sort(array , String::compareToIgnoreCase);
    }
}
