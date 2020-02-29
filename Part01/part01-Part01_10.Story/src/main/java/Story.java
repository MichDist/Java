
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n" +
"What is the main character called?");
        String message = scanner.nextLine();
        //System.out.println(message);
        System.out.println("What is their job?");
        String nextMessage = scanner.nextLine();
        //System.out.println(nextMessage);
        System.out.println("Here is the story:\n" +
"Once upon a time there was " + message + ", who was " + nextMessage + ".\n" +
"On the way to work, " + message + " reflected on life.\n" +
"Perhaps " + message + " will not be " + nextMessage + " forever.");
    }
}
