package LambdaExpressions;

interface Printable {
    public void print(String message);
}

public class LamdaExpression_singleParameter {
    public static void main(String[] args) {

        // ============ without lambda ==============
        Printable withoutLambda = new Printable() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        withoutLambda.print("Hamid Mohamadi");

        // ============ with lambda =================
        Printable withLambda = (message) -> System.out.println(message);
        withLambda.print("Hamid Mohamadi");
    }
}
