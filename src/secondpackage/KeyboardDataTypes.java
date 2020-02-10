package secondpackage;
import java.util.Scanner;
public class KeyboardDataTypes {
 public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);
     System.out.println("Please enter your name");
     String yourName = scanner.nextLine();
     System.out.println("Please Enter Your Age");
     int yourAge = scanner.nextInt();
     System.out.println("Please Enter Your Weight");
     float yourWeight = scanner.nextFloat();
     System.out.println("Please Enter Your Hair Color");
     String yourHair = scanner.next();
     System.out.print("Thank you we recieved your information");

}
}
