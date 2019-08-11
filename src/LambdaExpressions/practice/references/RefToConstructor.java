package LambdaExpressions.practice.references;

import sun.plugin2.message.Message;

interface Imessage {
    Message1 getMessage(String msg);
}
class Message1{
    Message1(String msg){
        System.out.println(msg);
    }
}
public class RefToConstructor {
    public static void main(String[] args) {
        Imessage imessage = Message1::new;
        imessage.getMessage("hello");
    }
}
