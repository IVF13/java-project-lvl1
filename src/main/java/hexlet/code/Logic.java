package hexlet.code;

import java.util.Scanner;

public class Logic {
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
            toExamineAndCompare(trueAnswer, Integer.toString(num), name);
        }
        System.out.println("Congratulations, " + name + "!");
    }

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

    public static void calculatorPlay() {
        final int winsNum = 3;
        final int signChoice = 4;
        final int firstUpperNum = 20;
        final int secondUpperNum = 20;
        final int plus = 3;
        final int multiply = 2;
        int firstNum;
        int secondNum;
        String sign = "";
        String name = Cli.greet();
        int num;

        System.out.println("What is the result of the expression?");
        for (int i = 0; i < winsNum; i++) {
            firstNum = (int) (Math.random() * firstUpperNum);
            secondNum = (int) (Math.random() * secondUpperNum);
            if ((int) (Math.random() * signChoice) == plus) {
                num = firstNum + secondNum;
                sign = "+";
            } else if ((int) (Math.random() * signChoice) == multiply) {
                num = firstNum * secondNum;
                sign = "*";
            } else {
                num = firstNum - secondNum;
                sign = "-";
            }
            //System.out.println(num);
            toExamineAndCompare(Integer.toString(num), firstNum + " " + sign + " " + secondNum, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
