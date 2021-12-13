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

    public static void calculatorPlay() {
        final int winsNum = 3;
        final int signChoice = 4;
        final int firstUpperNum = 20;
        final int secondUpperNum = 20;
        final int multiply = 2;
        final int plus = 3;
        int firstNum;
        int secondNum;
        int num;
        String sign = "";

        String name = Cli.greet();

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
            //System.out.println("(Correct answer is " + num + ")");
            toExamineAndCompare(Integer.toString(num), firstNum + " " + sign + " " + secondNum, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static void gcdPlay() {
        final int winsNum = 3;
        final int firstUpperNum = 100;
        final int secondUpperNum = 100;
        int firstNum;
        int secondNum;

        String name = Cli.greet();
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < winsNum; i++) {
            firstNum = (int) (Math.random() * firstUpperNum);
            secondNum = (int) (Math.random() * secondUpperNum);
            int a = firstNum;
            int b = secondNum;
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            //System.out.println("(Correct answer is " + a + ")");
            toExamineAndCompare(Integer.toString(a), firstNum + " " + secondNum, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static void aProgression() {
        final int winsNum = 3;
        final int arrLenLowerNum = 5;
        final int arrLenUpperNum = 10;
        final int randomFirstProgNum = 20;
        final int randStepUpperNum = 10;

        String name = Cli.greet();
        System.out.println("What number is missing in the progression?");

        for (int j = 0; j < winsNum; j++) {
            StringBuilder arr = new StringBuilder();
            int[] progArr = new int[arrLenLowerNum + (int) (Math.random() * arrLenUpperNum)];
            int step = 1 + (int) (Math.random() * randStepUpperNum);
            int hiddenElementNum = (int) (Math.random() * (progArr.length));
            progArr[0] = (int) (Math.random() * randomFirstProgNum);
            for (int i = 0; i < progArr.length; i++) {
                if (i != 0) {
                    progArr[i] = progArr[i - 1] + step;
                }
                if (i == hiddenElementNum) {
                    arr.append(" .. ");
                } else {
                    arr.append(" " + progArr[i] + " ");
                }
            }
            System.out.println("(Correct answer is " + progArr[hiddenElementNum] + ")");
            toExamineAndCompare(Integer.toString(progArr[hiddenElementNum]), arr.toString(), name);
            progArr = null;
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
