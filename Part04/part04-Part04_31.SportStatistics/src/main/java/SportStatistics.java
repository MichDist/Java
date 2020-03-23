
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        
        int counter = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner scanner = new Scanner(Paths.get(file))) {

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] parts = line.split(",");
            String homeTeam = parts[0];
            String visitingTeam = parts[1];
            int htPoints = Integer.valueOf(parts[2]);
            int vtPoints = Integer.valueOf(parts[3]);
            
            if(homeTeam.equals(team) || visitingTeam.equals(team)) {
                counter++;
                if((homeTeam.equals(team) && htPoints > vtPoints) || (visitingTeam.equals(team)) && vtPoints > htPoints) {
                    wins++;
                }
                if((homeTeam.equals(team) && htPoints < vtPoints) || (visitingTeam.equals(team)) && vtPoints < htPoints) {
                    losses++;
                } 
            }
            
        }
    } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
    }

        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }

}
