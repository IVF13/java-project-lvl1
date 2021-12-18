package hexlet.code;

import java.util.Scanner;

public class Logic {

    public static void toExamineAndCompare(String trueAnswer, String expression, String name) {
        System.out.println("Question: " + expression);
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


}
