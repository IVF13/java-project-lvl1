package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void evenPlay(int winsNum) {
        final int upperNum = 100;
        int num;
        String[] generatedNumbers = new String[winsNum];
        String[] answers = new String[winsNum];
        String name = Cli.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < winsNum; i++) {
            num = (int) (Math.random() * upperNum);
            if (num % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
            generatedNumbers[i] = Integer.toString(num);
        }
        Engine.toExamineAndCompare(answers, generatedNumbers, name, winsNum);
    }
}
