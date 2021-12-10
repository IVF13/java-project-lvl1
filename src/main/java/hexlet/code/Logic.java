package hexlet.code;

import java.util.Scanner;

public class Logic {
    public static void evenPlay() {
        final int winsNum = 3;
        final int lowerNum = 0;
        final int upperNum = 100;
        int num = 0;
        String trueAnswer = "";
        String name = Cli.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < winsNum; i++) {

            num = lowerNum + (int) (Math.random() * upperNum);
            if (num % 2 == 0) {
                trueAnswer = "yes";
            } else {
                trueAnswer = "no";
            }

            System.out.println("Question: " + num);
            Scanner ask = new Scanner(System.in);
            System.out.print("Your answer: ");

            if (ask.hasNextLine()) {
                String answer = ask.nextLine();
                if (answer.equals(trueAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + answer + "'" + "is wrong answer ;(. ");
                    System.out.println("Correct answer was " + "'" + trueAnswer + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    System.exit(0);
                }
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
