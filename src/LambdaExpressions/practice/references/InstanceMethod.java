package LambdaExpressions.practice.references;

import java.util.function.BiFunction;

interface SayAbleExam{
    void Say();
}
public class InstanceMethod {
    public void saySomthingExam(){
        System.out.println("Instance Method ...");
    }
    public void printMessage(){
        System.out.println("This is Instance Method");
    }
    public int add(int a, int b){
        return a + b;
    }


    public static void main(String[] args) {
        InstanceMethod instanceMethod = new InstanceMethod();
        SayAbleExam sayAbleExam = instanceMethod::saySomthingExam;
        sayAbleExam.Say();

        SayAbleExam sayable = new InstanceMethod()::saySomthingExam;
        sayable.Say();

        Thread thread = new Thread(new InstanceMethod()::printMessage);
        thread.start();

        BiFunction<Integer, Integer, Integer> adder = new InstanceMethod()::add;
        int result = adder.apply(10,30);
        System.out.println(result);
    }
}
