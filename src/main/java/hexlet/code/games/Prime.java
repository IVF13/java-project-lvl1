package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.math.BigInteger;

public class Prime {
    public static void primePlay(int winsNum) {
        final int randUpperNum = 20;
        String[] generatedNumbers = new String[winsNum];
        String[] answers = new String[winsNum];

        String name = Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < winsNum; i++) {
            int num = (int) (Math.random() * randUpperNum);
            BigInteger bigInteger = BigInteger.valueOf(num);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(num));

            if (probablePrime) {
                //System.out.println("(Correct answer is yes)");
                answers[i] = "yes";
                generatedNumbers[i] = Integer.toString(num);
            } else {
                //System.out.println("(Correct answer is no)");
                answers[i] = "no";
                generatedNumbers[i] = Integer.toString(num);
            }
        }
        Engine.toExamineAndCompare(answers, generatedNumbers, name, winsNum);
    }
}
