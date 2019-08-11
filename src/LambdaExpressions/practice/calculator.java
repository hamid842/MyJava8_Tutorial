package LambdaExpressions.practice;
interface Calculate{
    int add(int a , int b);
    default void remDefult (int a , int b){
        System.out.println(a%b);
    }
}

public class calculator {
    public static void main(String[] args) {
        Calculate sum = (int a, int b)-> (a+b);
        int sum1 = sum.add(10,20);
        Calculate multi = (int a, int b)->(a*b);
        int multi1 = multi.add(10,20);
        Calculate dive = (int a, int b)-> (a/b);
        int dive1 = dive.add(10,20);
        Calculate sub = (int a, int b)-> (a-b);
        int sub1 = sub.add(10,20);
        System.out.println("addition : "+sum1 +"\n"+"substract : "+sub1+"\n"+"multiple : "+multi1+"\n"+"division : "+dive1);

    }

}
