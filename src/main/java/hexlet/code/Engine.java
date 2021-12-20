package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void toExamineAndCompare(String[] ans, String[] exp, String name, int winsNum, String question) {
        System.out.println(question);
        for (int i = 0; i < winsNum; i++) {
            System.out.println("Question: " + exp[i]);
            Scanner ask = new Scanner(System.in);
            System.out.print("Your answer: ");
            if (ask.hasNextLine()) {
                String answer = ask.nextLine();
                if (answer.equals(ans[i])) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                    System.out.println("Correct answer was " + "'" + ans[i] + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    System.exit(0);
                }
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }


}
