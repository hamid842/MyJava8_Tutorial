package LambdaExpressions;

public class LambdaExpression_createingThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Example without lambda");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //with lambda
        Runnable withLmbda = ()-> System.out.println("Runnable example with lambda");
        Thread thread1 = new Thread(runnable);
                thread1.start();
    }
}
