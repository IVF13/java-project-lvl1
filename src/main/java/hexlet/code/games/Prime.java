package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

import java.math.BigInteger;

public class Prime {
    public static final String QUEST = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primePlay() {
        int winsNum = Engine.WINSNUM;
        final int numGenUpperNum = 20;
        String[] generatedNumbersQuestionSet = new String[winsNum];
        String[] answers = new String[winsNum];

        for (int i = 0; i < winsNum; i++) {
            int num = Utils.genRandInt(numGenUpperNum);
            BigInteger numForChecking = BigInteger.valueOf(num);
            answers[i] = numForChecking.isProbablePrime(num) ? "yes" : "no";
            generatedNumbersQuestionSet[i] = Integer.toString(num);
        }

        Engine.toExamineAndCompare(answers, generatedNumbersQuestionSet, QUEST);
    }
}
