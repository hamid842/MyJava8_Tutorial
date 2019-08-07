package LambdaExpressions;

interface Sayable {
    public String say();
}

public class LambdaExpression_noParameter {
    public static void main(String[] args) {
        //============== without lambda ==============
        Sayable withoutLambda = new Sayable() {
            @Override
            public String say() {
                return "Return something ... ";
            }
        };
        withoutLambda.say();
        //============= with lambda ==================
        Sayable withLambda = ()-> {
            return "Return somthing ... ";
        };
       withLambda.say();
    }
}
