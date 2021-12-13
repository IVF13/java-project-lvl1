package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Logic;

import java.math.BigInteger;

public class Prime {
    public static void primePlay() {
        final int winsNum = 3;
        final int randUpperNum = 20;

        String name = Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < winsNum; i++) {
            int num = (int) (Math.random() * randUpperNum);
            BigInteger bigInteger = BigInteger.valueOf(num);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(num));

            if (probablePrime) {
                //System.out.println("(Correct answer is yes)");
                Logic.toExamineAndCompare("yes", Integer.toString(num), name);
            } else {
                //System.out.println("(Correct answer is no)");
                Logic.toExamineAndCompare("no", Integer.toString(num), name);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
