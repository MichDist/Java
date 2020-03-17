
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 0;
        String name = "";
        int counter = 0;
        int sum = 0;
        
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")) {
                break;
            }
            
            String[] arr = str.split(",");
            int tempName = arr[0].length();
            
            if(tempName > name.length()) {
                name = arr[0];
            }
            
            sum = sum + Integer.valueOf(arr[1]);
            counter++;
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double)sum/(double)counter);
    }
}
