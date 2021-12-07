package hexlet.code;
import java.util.Scanner;

public class Cli{
    public static void Name(){
        String name = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        if (sc.hasNextLine()) {
           name = sc.nextLine();
           System.out.println("Hello, " + name + "!");
       } 
    }
}
