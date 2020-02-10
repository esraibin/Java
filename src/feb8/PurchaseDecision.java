package feb8;
import java.util.Scanner;
public class PurchaseDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  color of the item.It could be either red or blue");
        String color = scanner.nextLine();
        System.out.println("Please enter Tag price");
        double price = scanner.nextDouble();
        System.out.println("Please enter Discount percentage (0.1-0.9");
        float percentage = scanner.nextFloat();

        int colorValue = 0;
        if (color.compareToIgnoreCase("red") == 0) {
            colorValue = 20;
        } else if (color.compareToIgnoreCase("blue") == 0) {
            colorValue = 10;
        } else
            System.out.println("Please enter valid information");
    }

    /*int productPoint = (int) (price * discount - colorValue);


         if(point>100){
        System.out.println("Do not buy");

    }
    else if()

    {

    }
    else

    {
        System.out.println("Buy it now");
    }
}



     */

}
