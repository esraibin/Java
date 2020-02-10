package Feb3;
import java.util.Scanner;
public class IfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = scanner.nextInt();
        int remainder = number%2;
        if(remainder== 1){
            System.out.println("Odd number");
        }


    }

}
