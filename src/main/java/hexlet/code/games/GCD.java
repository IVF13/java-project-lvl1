package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Logic;

public class GCD {
    public static void gcdPlay() {
        final int winsNum = 3;
        final int firstUpperNum = 100;
        final int secondUpperNum = 100;
        int firstNum;
        int secondNum;

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
            //System.out.println("(Correct answer is " + a + ")");
            Logic.toExamineAndCompare(Integer.toString(a), firstNum + " " + secondNum, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
