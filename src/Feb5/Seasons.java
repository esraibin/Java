package Feb5;
import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature");
        int temp = scanner.nextInt();

        if (temp <= 20) {
            System.out.println("Winter");

        } else if (temp >20 && temp<41) {
            System.out.println("Fall");

        } else if (temp>41 && temp<=60) {
            System.out.println("Spring");

        } else {
            System.out.println("Summer");

        }
    }
    }

