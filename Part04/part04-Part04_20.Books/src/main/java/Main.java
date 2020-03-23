import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String decision = scanner.nextLine();
        for(Book item : bookList) {
            if(decision.equals("everything")) {
                System.out.println(item.getTitle() + ", " + item.getPages() + " pages, " + item.getYear());
            }
            if(decision.equals("name")) {
                System.out.println(item.getTitle());
            }
        }
    }
}
