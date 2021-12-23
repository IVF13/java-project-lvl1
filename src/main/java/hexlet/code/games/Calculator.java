package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calculator {
    public static final String QUEST = "What is the result of the expression?";

    public static void calculatorPlay(int winsNum) {
        final int firstUpperNum = 20;
        final int secondUpperNum = 20;
        int num = 0;

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
                    break;
            }

            answers[i] = Integer.toString(num);
            generatedExpressions[i] = firstNum + " " + sign + " " + secondNum;
        }
        Engine.toExamineAndCompare(answers, generatedExpressions, name, winsNum, QUEST);
    }

    private static String signChoose() {
        String[] signs = {"-", "*", "+"};
        final int signChoiceNum = 3;
        return signs[Utils.genRandInt(signChoiceNum)];
    }
}
