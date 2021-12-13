package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int greetCase = 1;
        final int evenCase = 2;
        final int calculatorCase = 3;
        final int gcdCase = 4;
        final int aProgressionCase = 5;
        final int primeCase = 6;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(greetCase + " - Greet");
        System.out.println(evenCase + " - Even");
        System.out.println(calculatorCase + " - Calc");
        System.out.println(gcdCase + " - GCD");
        System.out.println(aProgressionCase + " - Progression");
        System.out.println(primeCase + " - Prime");
        System.out.println("0 - Exit");
        Scanner choice = new Scanner(System.in);
        System.out.print("Your choice: ");
        if (choice.hasNextInt()) {
            switch (choice.nextInt()) {
                case (greetCase):
                    Cli.greet();
                    break;
                case (evenCase):
                    Logic.evenPlay();
                    break;
                case (calculatorCase):
                    Logic.calculatorPlay();
                    break;
                case (gcdCase):
                    Logic.gcdPlay();
                    break;
                case (aProgressionCase):
                    Logic.aProgressionPlay();
                    break;
                case (primeCase):
                    Logic.primePlay();
                    break;
                default:
                    break;
            }
        }
    }
}

