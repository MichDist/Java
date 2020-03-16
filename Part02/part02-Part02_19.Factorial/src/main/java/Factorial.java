
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        
        int res = 1;
        for(int i = 1; i <= input; i++) {
            res = res * i;
        }
        
        System.out.println("Factorial: " + res);
    }
}
