package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    public static void gcdPlay(int winsNum) {
        final int firstUpperNum = 100;
        final int secondUpperNum = 100;
        int firstNum;
        int secondNum;
        String[] generatedGCD = new String[winsNum];
        String[] answers = new String[winsNum];

        String name = Cli.greet();
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < winsNum; i++) {
            firstNum = (int) (Math.random() * firstUpperNum);
            secondNum = (int) (Math.random() * secondUpperNum);
            int a = firstNum;
            int b = secondNum;
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            answers[i] = Integer.toString(a);
            generatedGCD[i] = firstNum + " " + secondNum;
            System.out.println("(Correct answer is " + a + ")");
        }
        Engine.toExamineAndCompare(answers, generatedGCD, name, winsNum);
    }
}
