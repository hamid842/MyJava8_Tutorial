package LambdaExpressions.practice.functionalnterface;
@FunctionalInterface
interface SayableSample{
    void say(String name);
}
public class CustomFunctionalInterfaceSample {
    public static void main(String[] args) {
        SayableSample sayableSample = (msg)-> {
            System.out.println(msg);
        };
        sayableSample.say("My Name is Nahid");
    }

}
