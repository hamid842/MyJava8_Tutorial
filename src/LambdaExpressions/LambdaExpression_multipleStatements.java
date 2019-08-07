package LambdaExpressions;

interface IAvarage {
    double avg(int[] array);
}

public class LambdaExpression_multipleStatements {
    public static void main(String[] args) {
        // ========== without lambda ===============
        IAvarage withoutLambda = new IAvarage() {
            @Override
            public double avg(int[] array) {
                double sum = 0;
                int arraySize = array.length;
                System.out.println("Array size :" + arraySize);
                for (int i = 0; i < arraySize; i++) {
                    sum = sum + array[i];
                }
                System.out.println("sum :" + sum);
                return (sum / arraySize);
            }
        };
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(withoutLambda.avg(array));
        //============== with lambda ==============
        IAvarage withLambda = (we) -> {
            double sum = 0;
            int arraySize = we.length;
            System.out.println("Array size :" + arraySize);
            for (int i = 0; i < arraySize; i++) {
                sum = sum + we[i];
            }
            System.out.println("sum :" + sum);
            return (sum / arraySize);
        };
        int[] withLambdaArray = {1, 2, 3, 4, 5};
        System.out.println(withLambda.avg(withLambdaArray));
    }
}
