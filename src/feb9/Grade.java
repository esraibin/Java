package feb9;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Grade to enter learn numeric value ");
        int Grade = scanner.nextInt();

        if(Grade <0 && Grade > 100){
            System.out.println("Please enter grade only between 0-100");
        }
        else if(Grade >0 && Grade < 50){
            System.out.println("Fail");
        }
        else if(Grade < 60){
            System.out.println("D");
        }
        else if(Grade < 70){
            System.out.println("C");
        }
        else if(Grade < 80){
            System.out.println("B");
        }
        else if(Grade < 90){
            System.out.println("A");
        }
        else {
            System.out.println("A+");
        }

    }
}
