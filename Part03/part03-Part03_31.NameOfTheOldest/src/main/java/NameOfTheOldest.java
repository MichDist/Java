
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        String name = "";
        
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")) {
                break;
            }
            
            String[] arr = str.split(",");
            int temp = Integer.valueOf(arr[1]);
            
            if(temp > age) {
                age = temp;
                name = arr[0];
            }
        }
        
        
        System.out.println("Name of the oldest: " + name);
    }
}
