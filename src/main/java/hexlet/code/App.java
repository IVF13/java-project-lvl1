package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        Scanner choice = new Scanner(System.in);
        System.out.println("Your choice: ");
        if (choice.hasNextInt()) {
            int number = choice.nextInt();
            if (number == 1) {
                Cli.greet();
            } else if (number == 0) {
                System.exit(0);
            }
        }
    }
}

