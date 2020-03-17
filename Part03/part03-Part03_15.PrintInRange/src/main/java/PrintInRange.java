
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in range [" + lowerLimit + ", " + upperLimit + "]");
        
        for(int number : numbers) {
            for(int i = lowerLimit; i < upperLimit; i++) {
                if(number == i) {
                    System.out.println(number);
                }
            }
        }
    }
}
