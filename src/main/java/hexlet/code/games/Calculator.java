package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calculator {
    public static final String QUEST = "What is the result of the expression?";

    public static void calculatorPlay(int winsNum) {
        final int firstUpperNum = 20;
        final int secondUpperNum = 20;
        int num;

        String[] generatedExpressions = new String[winsNum];
        String[] answers = new String[winsNum];
        String name = Cli.greet();
        for (int i = 0; i < winsNum; i++) {
            int firstNum = Utils.genRandInt(firstUpperNum);
            int secondNum = Utils.genRandInt(secondUpperNum);
            String sign = signChoose();

            switch (sign) {
                case ("+"):
                    num = firstNum + secondNum;
                    break;
                case ("*"):
                    num = firstNum * secondNum;
                    break;
                case ("-"):
                    num = firstNum - secondNum;
                    break;
                default:
                    num = 0;
                    break;
            }

            answers[i] = Integer.toString(num);
            generatedExpressions[i] = firstNum + " " + sign + " " + secondNum;
        }
        Engine.toExamineAndCompare(answers, generatedExpressions, name, winsNum, QUEST);
    }

    private static String signChoose() {
        final int signChoiceNum = 4;
        final int multiply = 2;
        final int plus = 3;
        String sign = "";

        if (Utils.genRandInt(signChoiceNum) == plus) {
            sign = "+";
        } else if (Utils.genRandInt(signChoiceNum) == multiply) {
            sign = "*";
        } else {
            sign = "-";
        }
        return sign;
    }
}
