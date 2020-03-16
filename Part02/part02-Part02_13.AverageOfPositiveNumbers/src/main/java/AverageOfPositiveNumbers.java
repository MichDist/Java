
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double counter = 0;
        while(true) {
            System.out.println("Give a number:");
            double input = Double.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            } else if(input > 0) {
                counter++;
                sum = sum + input;
                continue;
            }
        
        }
        if(sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((sum/counter));
        }
    }
}
