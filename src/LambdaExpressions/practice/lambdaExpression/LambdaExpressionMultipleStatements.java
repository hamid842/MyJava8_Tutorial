package LambdaExpressions.practice.lambdaExpression;

interface IavrageSample {
    double ave(int[] array);
}

public class LambdaExpressionMultipleStatements {
    public static void main(String[] args) {
        IavrageSample iavrageSample = new IavrageSample() {
            @Override
            public double ave(int[] array) {
                double sum = 0;
                int arraySize = array.length;
                System.out.println(arraySize);
                for (int i = 0; i < array.length; i++) {
                    sum = sum + array[i];
                }
                System.out.println("sum =" + sum);
                return sum / arraySize;
            }
        };
        int[] array = {2, 4, 6, 9};
        System.out.println(iavrageSample.ave(array));
        //lambda
        IavrageSample withLambda = (withLambdaArray) -> {
            double sum = 0;
            int arr = withLambdaArray.length;
            System.out.println(arr);
            for (int i = 0; i < arr; i++) {
                sum = sum + withLambdaArray[i];
            }
            System.out.println(sum);
            return sum / arr;
        };
        int[] withLambdaArr = {2, 5, 8, 0};
        System.out.println(withLambda.ave(withLambdaArr));
    }

}
