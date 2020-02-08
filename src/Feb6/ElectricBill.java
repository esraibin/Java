package Feb6;

import java.util.Scanner;
public class ElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Electric Consumption");
        float consump = scanner.nextFloat();

        if (consump > 0 && consump < 500) {
            System.out.println("Your electric bill is $" + (consump * 0.3));
        }
        else if(consump >= 500 && consump < 1000){
            System.out.println("Your electric bill is $"+(consump* 0.4));
        }
        else if(consump >= 1000 && consump < 2000){
            System.out.print("Your electric bill is $"+(consump*0.5));
        }
        else if(consump >= 2000){
            System.out.println("Your electric bill is $"+(consump*0.6));
        }
        else {
            System.out.println("Please enter valid consumption");
        }

    }
}
