package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;


public class Even {
    public static final String QUEST = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenPlay() {
        int winsNum = Engine.WINSNUM;
        final int numGenUpperNum = 100;
        int num;
        String[] generatedNumbersQuestionSet = new String[winsNum];
        String[] answers = new String[winsNum];

        for (int i = 0; i < winsNum; i++) {
            num = Utils.genRandInt(numGenUpperNum);
            answers[i] = isEven(num) ? "yes" : "no";
            generatedNumbersQuestionSet[i] = Integer.toString(num);
        }

        Engine.toExamineAndCompare(answers, generatedNumbersQuestionSet, QUEST);
    }

    private static boolean isEven(int num) {
        return (num % 2 == 0);
    }

}
