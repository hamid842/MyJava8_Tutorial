package LambdaExpressions.practice.lambdaExpression;
interface ArithmaticSample {
    int add(int a, int b);
}
public class LambdaExpressionwithorwithoutreturn {
    public static void main(String[] args) {
        // without lambda
        ArithmaticSample addable = new ArithmaticSample() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        addable.add(10, 20);
        //without return keyword.
        ArithmaticSample withLambda = (a, b) -> (a + b);
        System.out.println(withLambda.add(30, 40));
        //with return keyword.
        ArithmaticSample arithmatic = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(arithmatic.add(10, 20));
    }
}
