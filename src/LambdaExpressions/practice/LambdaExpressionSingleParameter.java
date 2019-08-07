package LambdaExpressions.practice;

interface PrintableSample{
    void print(String msg);
}
public class LambdaExpressionSingleParameter {
    public static void main(String[] args) {
        PrintableSample printableSample = new PrintableSample() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printableSample.print("lambda expression single parameter");
        PrintableSample printAble = (msg) -> System.out.println(msg);
        printAble.print("lambda expression single parameter with lambda");

    }
}
