
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        int search = 0;
        System.out.println("Search for?");
        search = Integer.valueOf(scanner.nextLine());
        int index = 0;
        for(int i = 0; i < list.size(); i++) {
            if(search == list.get(i)) {
                index = i;
                System.out.println(search + " is at index " + i);
            }
        }
    }
}