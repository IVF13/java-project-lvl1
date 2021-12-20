package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;


public class Calculator {
    public static final String condition = "What is the result of the expression?";
    public static void calculatorPlay(int winsNum) {
        final int signChoiceNum = 4;
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
        for (int i = 0; i < winsNum; i++) {
            firstNum = Utils.genRandInt(firstUpperNum);
            secondNum = Utils.genRandInt(secondUpperNum);
            if (Utils.genRandInt(signChoiceNum) == plus) {
                num = firstNum + secondNum;
                sign = "+";
            } else if (Utils.genRandInt(signChoiceNum) == multiply) {
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
        Engine.toExamineAndCompare(answers, generatedExpressions, name, winsNum, condition);
    }
}
