package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner choice = new Scanner(System.in);
        System.out.print("Your choice: ");
        if (choice.hasNextInt()) {
            switch (choice.nextInt()) {
                case (1):
                    Cli.greet();
                    System.exit(0);
                case (2):
                    Logic.evenPlay();
                    System.exit(0);
                case (3):
                    Logic.calculatorPlay();
                    System.exit(0);
                case (0):
                    System.exit(0);
                default:
                    System.exit(0);
            }
            /*int number = choice.nextInt();
            if (number == 1) {
                Cli.greet();
            } else if (number == 2) {
                Logic.evenPlay();
            } else if (number == 3) {
                Logic.calculatorPlay();
            } else if (number == 0) {
                System.exit(0);
            }*/
        }
    }
}

