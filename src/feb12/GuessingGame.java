package feb12;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int realnumber = 34;
        System.out.println("PLease guess a number");
        int guessednumber = scanner.nextInt();


        if(guessednumber > realnumber){
            System.out.println("Number is Bigger");
        }
        else if(guessednumber< realnumber){
            System.out.println("Number is Smaller,");
        }
        else {
            System.out.println("correct number");
        }
    }
}
