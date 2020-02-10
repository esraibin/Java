package feb9;
import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the subject: (Math/Art");
        String subject = scanner.nextLine();
        if(subject.equalsIgnoreCase("Math")){
            System.out.println("dou you need tutor? (Y/N)");
            String tutor = scanner.nextLine();
            if(tutor.equalsIgnoreCase("Y")){
                System.out.println("OK");
            }
            else if (tutor.equalsIgnoreCase("N")){
                System.out.println("Study by yourself");
            }


        }
        else if(subject.equalsIgnoreCase("Art")){
            System.out.println("Nice choice");
        }
    }

}
