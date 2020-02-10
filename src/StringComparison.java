
import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args) {
        System.out.println("Please enter your gender as M for Male or F for Female:");
        Scanner scanner = new Scanner(System.in);
        String Gender = scanner.next();

        if(Gender.equals("M")){
            System.out.println("Male");
        }
        else if (Gender.equals("F")){
            System.out.println("Female");
        }
        else {
            System.out.println("Please enter F or M");
        }


    }
}
