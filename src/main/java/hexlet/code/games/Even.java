package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;


public class Even {
    public static final String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenPlay(int winsNum) {
        final int upperNum = 100;
        int num;
        String[] generatedNumbers = new String[winsNum];
        String[] answers = new String[winsNum];
        String name = Cli.greet();

        for (int i = 0; i < winsNum; i++) {
            num = Utils.genRandInt(upperNum);
            answers[i] = evenCheck(num) ? "yes" : "no";
            generatedNumbers[i] = Integer.toString(num);
        }

        Engine.toExamineAndCompare(answers, generatedNumbers, name, winsNum, condition);
    }

    private static boolean evenCheck(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
