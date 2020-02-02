package secondpackage;
import java.util.Scanner;

public class RectangleUserInput {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please enter length of the rectangle");
        int length =scanner.nextInt();
        System.out.println("Please enter the windth of the rectangle");
        int windth = scanner.nextInt();
        System.out.println("Area of the rectangel is "+2*(length+windth));

    }
}
