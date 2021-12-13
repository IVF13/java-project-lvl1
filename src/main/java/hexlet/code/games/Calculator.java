package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Logic;

public class Calculator {
    public static void calculatorPlay() {
        final int winsNum = 3;
        final int signChoice = 4;
        final int firstUpperNum = 20;
        final int secondUpperNum = 20;
        final int multiply = 2;
        final int plus = 3;
        int firstNum;
        int secondNum;
        int num;
        String sign = "";

        String name = Cli.greet();

        System.out.println("What is the result of the expression?");
        for (int i = 0; i < winsNum; i++) {
            firstNum = (int) (Math.random() * firstUpperNum);
            secondNum = (int) (Math.random() * secondUpperNum);
            if ((int) (Math.random() * signChoice) == plus) {
                num = firstNum + secondNum;
                sign = "+";
            } else if ((int) (Math.random() * signChoice) == multiply) {
                num = firstNum * secondNum;
                sign = "*";
            } else {
                num = firstNum - secondNum;
                sign = "-";
            }
            //System.out.println("(Correct answer is " + num + ")");
            Logic.toExamineAndCompare(Integer.toString(num), firstNum + " " + sign + " " + secondNum, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
