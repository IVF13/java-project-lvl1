package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void toExamineAndCompare(String[] answers, String[] expression, String name, int winsNum) {
        for (int i=0; i < winsNum; i++) {
            System.out.println("Question: " + expression[i]);
            Scanner ask = new Scanner(System.in);
            System.out.print("Your answer: ");
            if (ask.hasNextLine()) {
                String answer = ask.nextLine();
                if (answer.equals(answers[i])) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + answer + "'" + "is wrong answer ;(. ");
                    System.out.println("Correct answer was " + "'" + answers[i] + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    System.exit(0);
                }
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }


}
