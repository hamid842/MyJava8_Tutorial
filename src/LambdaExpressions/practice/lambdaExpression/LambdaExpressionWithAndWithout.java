package LambdaExpressions.practice.lambdaExpression;

interface DrawableSample{
    public void draw1();
}
public class LambdaExpressionWithAndWithout {
    public static void main(String[] args) {
        int width = 20;
        DrawableSample withoutLam = new DrawableSample() {
         //without lambda
            @Override
            public void draw1() {
                System.out.println("Draw " + width);
            }
        };
        withoutLam.draw1();
        //with lambda
        DrawableSample withLam = () -> System.out.println("Draw with lambda " + width);
        withLam.draw1();
    }
}
