package LambdaExpressions.practice.lambdaExpression;

interface SayableSample{
    public String sayExample();
        }
public class LambdaExpressionNoParameter {
    public static void main(String[] args) {
        SayableSample sayableSample = new SayableSample(){
//without Lambda
            @Override
            public String sayExample() {
                return "Return Something ";
            }
        };
        sayableSample.sayExample();
        //with Lambda
        SayableSample say = ()-> {return "Return lambda";};
        say.sayExample();
    }
}
