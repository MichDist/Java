
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")) {
                break;
            }
            
            String[] arr = str.split(",");
            int temp = Integer.valueOf(arr[1]);
            if(temp > age) {
                age = temp;
            }
        }
        System.out.println("Age of the oldest: " + age);
    }
}
