package feb9;
import java.util.Scanner;
public class ComputerSkill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your skill : Java, SQL or Cloud");
        String skill = scanner.nextLine();

        if(skill.equalsIgnoreCase("Java")){
            System.out.println("What is your Java score: ");
            int javascore = scanner.nextInt();

        }
        else if(skill.equalsIgnoreCase("SQL")){
            System.out.println("What is your HackerRank score? (0-1000)");
            int HackerRankScore = scanner.nextInt();

            if(HackerRankScore < 500){
                System.out.println("Solve more problems");
            }
            else if(HackerRankScore > 800){
                System.out.println("Nice");
            }
            else{
                System.out.println("perfect");
            }
        }
        else if(skill.equalsIgnoreCase("Cloud")){
            System.out.println("Do you have Cloud Certification? (Y/N) ");
            String certificate = scanner.next();

        }
        else {
        }
        System.out.println("Only Java/SQL/Cloud");
    }
}
