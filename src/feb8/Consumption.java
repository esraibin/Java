package feb8;

import java.util.Scanner;
public class Consumption {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter consumption  : ");
        int myConsumption = myscanner.nextInt();
        double electricBill;
        if (myConsumption < 501) {
            electricBill = myConsumption * 0.3;
        }
        else if (myConsumption < 1001) {
        electricBill = myConsumption * 0.4;
    }
        else if (myConsumption < 2001) {
            electricBill = myConsumption * 0.5;

        }
        else {
            electricBill = myConsumption * .6;// without 0 double number are ok.Like .6546
        }
        System.out.format("$%.2f",electricBill);
    }

    }

