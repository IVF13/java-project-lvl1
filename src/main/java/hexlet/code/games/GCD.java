package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class GCD {
    public static final String condition = "Find the greatest common divisor of given numbers.";

    public static void gcdPlay(int winsNum) {
        final int firstUpperNum = 100;
        final int secondUpperNum = 100;
        int firstNum;
        int secondNum;
        String[] generatedGCD = new String[winsNum];
        String[] answers = new String[winsNum];

        String name = Cli.greet();

        for (int i = 0; i < winsNum; i++) {
            firstNum = Utils.genRandInt(firstUpperNum);
            secondNum = Utils.genRandInt(secondUpperNum);
            answers[i] = Integer.toString(gcdSearch(firstNum, secondNum));
            generatedGCD[i] = firstNum + " " + secondNum;
        }
        Engine.toExamineAndCompare(answers, generatedGCD, name, winsNum, condition);
    }

    private static int gcdSearch(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        //System.out.println("(Correct answer is " + a + ")");
        return a;
    }

}
