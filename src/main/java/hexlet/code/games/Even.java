package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Logic;

public class Even {
    public static void evenPlay() {
        final int winsNum = 3;
        final int upperNum = 100;
        int num;
        String trueAnswer = "";
        String name = Cli.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < winsNum; i++) {
            num = (int) (Math.random() * upperNum);
            if (num % 2 == 0) {
                trueAnswer = "yes";
            } else {
                trueAnswer = "no";
            }
            Logic.toExamineAndCompare(trueAnswer, Integer.toString(num), name);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
