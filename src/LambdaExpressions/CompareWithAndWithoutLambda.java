package LambdaExpressions;
interface Drawable{
    public void drow();
}

public class CompareWithAndWithoutLambda {
    public static void main(String[] args) {
        int width = 10;

        //================ without lambda ================
        Drawable withoutLambda = new Drawable() {
            @Override
            public void drow() {
                System.out.println("Drawing =" + width);
            }
        };
        withoutLambda.drow();

        //================= with lambda ==================
        Drawable withLambda = () -> {
                System.out.println("Drawing(with lambda) =" + width);
        };
        withLambda.drow();
    }
}
