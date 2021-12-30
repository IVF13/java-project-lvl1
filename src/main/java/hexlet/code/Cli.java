package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greet() {
        String name = "";
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        if (sc.hasNextLine()) {
            name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
        }
        return name;
    }
}
