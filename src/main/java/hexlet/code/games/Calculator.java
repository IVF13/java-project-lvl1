package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calculator {
    public static void calculatorPlay(int winsNum) {
        final int signChoice = 4;
        final int firstUpperNum = 20;
        final int secondUpperNum = 20;
        final int multiply = 2;
        final int plus = 3;
        int firstNum;
        int secondNum;
        int num;
        String sign = "";
        String[] generatedExpressions = new String[winsNum];
        String[] answers = new String[winsNum];

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
            answers[i] = Integer.toString(num);
            generatedExpressions[i] = firstNum + " " + sign + " " + secondNum;
            //System.out.println("(Correct answer is " + num + ")");
        }
        Engine.toExamineAndCompare(answers, generatedExpressions, name, winsNum);
    }
}
