
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        
        int counter = input;
        while(input <= 100) {
            System.out.println(input);
            input++;
        }
    }
}
