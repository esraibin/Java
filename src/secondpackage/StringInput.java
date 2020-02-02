package secondpackage;
import java.util.Scanner;
public class StringInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String myName = scanner.next();
        System.out.println("Your name is "+ myName);
    }
}
