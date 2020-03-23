
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

        // we read the file until all lines have been read
        int temp = 0;
        while (scanner2.hasNextLine()) {
            // we read one line
            String row = scanner2.nextLine();
            
            if(row.equals(searchedFor)) {
                System.out.println("Found!");
                temp = 1;
                break;
            } 
        }
        if(temp == 0) {
            System.out.println("Not found.");
        }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
