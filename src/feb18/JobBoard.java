package feb18;
import java.util.Scanner;
public class JobBoard {
    public static void main(String[] args){
        int score =0;
        String JavaLevel = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Java level : entry, junior, senior");
        JavaLevel = scanner.nextLine();
        System.out.println("Please enter your SQL value : 100, 200, 300");
        int SQLLevel =scanner.nextInt();
        System.out.println("Please enter your experince as a year: between 0 - 10");
        int experience = scanner.nextInt();

        if(JavaLevel.equalsIgnoreCase("entry")){
            score =(500+SQLLevel)*experience;
        }
        else if(JavaLevel.equalsIgnoreCase("junior")){
            score =(1000+SQLLevel)*experience;
        }
        else if(JavaLevel.equalsIgnoreCase("senior")){
            score =(2000+SQLLevel)*experience;
        }
        else{
            System.out.println("Please enter valid level as entry, junior or senior");
        }

        if(score > 1000){
            System.out.println("We offer you annual $80000");

        }
        else if(score> 7000 && score <= 1000){
            System.out.println("We offer you annual $60000");
        }
        else if(score <= 7000 && score >= 5000){
            System.out.println("We offer you annual $40000");
        }
        else {
            System.out.println("We will keep your resume");
        }


    }
}
