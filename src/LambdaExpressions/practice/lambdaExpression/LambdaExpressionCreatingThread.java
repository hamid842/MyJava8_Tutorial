package LambdaExpressions.practice.lambdaExpression;

public class LambdaExpressionCreatingThread {
    public static void main(String[] args) {
        //without lambda
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("this is Runnable");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Runnable runnable1 = ()-> System.out.println("this is with Lambda");
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
