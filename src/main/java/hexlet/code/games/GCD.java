package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class GCD {
    public static final String QUEST = "Find the greatest common divisor of given numbers.";

    public static void gcdPlay() {
        int winsNum = Engine.WINSNUM;
        final int numGenUpperNum = 100;
        int firstNum;
        int secondNum;
        String[] generatedNumbersQuestionSet = new String[winsNum];
        String[] answers = new String[winsNum];

        for (int i = 0; i < winsNum; i++) {
            firstNum = Utils.genRandInt(numGenUpperNum);
            secondNum = Utils.genRandInt(numGenUpperNum);
            answers[i] = Integer.toString(gcdSearch(firstNum, secondNum));
            generatedNumbersQuestionSet[i] = firstNum + " " + secondNum;
        }
        Engine.toExamineAndCompare(answers, generatedNumbersQuestionSet, QUEST);
    }

    private static int gcdSearch(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}
