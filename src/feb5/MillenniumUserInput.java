package feb5;
import java.util.Scanner;
public class MillenniumUserInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = myScanner.nextInt();
        if(year>2000) {
            System.out.println("After Milenium");
        }
        else {
            System.out.println("Before Milenium");

        }
    }
}
