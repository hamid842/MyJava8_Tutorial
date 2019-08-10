package LambdaExpressions.practice.lambdaExpression;

import javax.swing.*;

public class LambdaExpressionEventListener {
    public static void main(String[] args) {
        JTextField jTextField = new JTextField();
        jTextField.setBounds(70,70,70,70);
        JButton jButton = new JButton("Click me");
        jButton.setBounds(50,50,50,50);
//        jButton.setAction(jTextField.getAction());
        //lambda
        jButton.addActionListener(e->{jTextField.setText("Hello my Friends");});
        JFrame jFrame = new JFrame();
        jFrame.add(jTextField);
        jFrame.add(jButton);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(300,200);
        jFrame.setVisible(true);
    }
}
