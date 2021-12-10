package hexlet.code;

import java.util.Scanner;

public class Logic {
    public static void evenPlay() {
        int num = 0;
        int counter = 0;
        int lowerNum = 0;
        int upperNum = 100;
        String trueAnswer = "";
        String name = Cli.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (counter < 3) {

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
                    counter += 1;
                } else {
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was " + "'" + trueAnswer + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    System.exit(0);
                }
            }
        }

        if (counter == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
