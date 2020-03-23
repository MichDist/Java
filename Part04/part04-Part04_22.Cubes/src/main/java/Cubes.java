
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("end")) {
                break;
            }
            counter++;
            
            int nbr = Integer.valueOf(str);
            
            nbr = nbr*nbr*nbr;
            System.out.println(nbr);
        }
        
        
    }
}
