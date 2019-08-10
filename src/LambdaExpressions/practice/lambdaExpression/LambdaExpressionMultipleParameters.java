package LambdaExpressions.practice.lambdaExpression;
interface AddableSample{
    int add(int a , int b);
}
public class LambdaExpressionMultipleParameters {
    public static void main(String[] args) {
        AddableSample addableSample = new AddableSample() {
            @Override
            public int add(int a, int b) {
                return a + b ;
            }
        };
        System.out.println(addableSample.add(10, 20));

        AddableSample addableSample1 = (int a , int b ) -> (a+b);
        System.out.println(addableSample1.add(20 , 30));
    }
}
