package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;


public class Calculator {
    public static final String QUEST = "What is the result of the expression?";

    public static void calculatorPlay() {
        final int numGenUpperNum = 20;
        int num = 0;
        int winsNum = Engine.WINSNUM;
        String[] generatedExpressionsQuestionSet = new String[winsNum];
        String[] answers = new String[winsNum];

        for (int i = 0; i < winsNum; i++) {
            int firstNum = Utils.genRandInt(numGenUpperNum);
            int secondNum = Utils.genRandInt(numGenUpperNum);
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
            generatedExpressionsQuestionSet[i] = firstNum + " " + sign + " " + secondNum;
        }
        Engine.toExamineAndCompare(answers, generatedExpressionsQuestionSet, QUEST);
    }

    private static String signChoose() {
        String[] signs = {"-", "*", "+"};
        final int signChoiceNum = signs.length;
        return signs[Utils.genRandInt(signChoiceNum)];
    }
}
