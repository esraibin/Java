package Feb5;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(number+" is odd number");
        }
        else{
            System.out.println(number+ " is even number");
    }
}
}
