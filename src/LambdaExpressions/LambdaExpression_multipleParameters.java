package LambdaExpressions;

interface Addable {
    int add(int a, int b);
}

public class LambdaExpression_multipleParameters {
    public static void main(String[] args) {

        // ======== without lambda ============
        Addable withoutLambda = new Addable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(withoutLambda.add(10, 20));
        // =========== with lambda ============
        Addable withLambda = (int a , int b)-> (a+b);
        System.out.println(withLambda.add(20,30));
    }
}
/*
 In Java lambda expression, if there is only one statement, you may or may
 not use return keyword. You must use return keyword when lambda expression
 contains multiple statements.
 */
