package LambdaExpressions.practice.references;

import java.util.function.BiFunction;

public class StaticMethod {
    public static void main(String[] args) {
        Thread thread = new Thread(()->System.out.println("Thread is Start with Lambda..."));
        thread.start();
        Thread thread1 = new Thread(StaticMethod:: ThreadStatus);
        thread1.start();

        BiFunction<Integer,Integer,Integer> adder = StaticMethod::add;
        BiFunction<Integer,Float,Float> adder2 = StaticMethod::add;
        BiFunction<Float,Float,Float> adder3 = StaticMethod::add;
        int res = adder.apply(10,20);
        float res2 = adder2.apply(20,30.0f);
        float res3 = adder3.apply(30.0f,40.0f);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

    }
    public static void ThreadStatus() {
        System.out.println("Thread is running...");
    }

    //sample2
    public static int add(int a , int b){
        return a+b;
    }
    public static float add(int a, float b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
}
