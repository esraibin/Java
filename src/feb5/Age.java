package feb5;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your age :");
        int age = scanner.nextInt();

        if(age <= 0 ) {
            System.out.println("Age cannot be smaller than 1");
        }
        else if (age>=120){
            System.out.println("Age cannot be larger then 120");
        }
        else{
            System.out.println("Thank you");
        }


    }
}
