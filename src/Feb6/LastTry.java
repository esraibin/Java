package Feb6;
import java.util.Scanner;
public class LastTry {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String ID1;
        String ID2;
        String ID3;
        String ID4;
        String ID5;

        ID1 = "123";
        ID2 = "124";
        ID3 = "125";
        ID4 = "126";
        ID5 = "127";

        float price1;
        price1 = 2.49f;
        float price2;
        price2 = 4.79f;
        float price3;
        price3 = 1.65f;
        float price4;
        price4 = 7.88f;
        float price5;
        price5 = 0.99f;



        System.out.println("what is ID number");
        float item1;
        item1 = myScan.nextFloat();
        System.out.println("what is Quantity");
        int quantity1;
        quantity1 = myScan.nextInt();
        System.out.println("what is 2nd ID number");
        float item2;
        item2 = myScan.nextFloat();
        System.out.println("what is Quantity");
        int quantity2;
        quantity2 = myScan.nextInt();
        System.out.println("what is 3rd ID number");
        float item3;
        item3 = myScan.nextFloat();
        System.out.println("what is Quantity");
        int quantity3;
        quantity3 = myScan.nextInt();
        //float item4;
        //  item4 = myScan.nextFloat();
        //System.out.println("what is Quantity");
        // float quantity4;
        // quantity4 = myScan.nextFloat();
        // float item5;
        //item5 = myScan.nextFloat();
        //  System.out.println("what is Quantity");
        // float quantity5;
        //quantity5 = myScan.nextFloat();
        // float item;

        float priceA = (price1 * quantity1);
        float priceB = (price2 * quantity2);
        float priceC = (price3 * quantity3);

        System.out.println("ItemID" + "      " + "Quantity" + "     " + "Price");
        System.out.println("-------------------------------");
        if (item1 == 123) {
            priceA = price1;
            System.out.println(" " + ID1 + "          " + quantity1 + "       " + "$" + (quantity1 * price1));
        }
        if (item1 == 124) {
            priceA = price2;
            System.out.println(" " + ID2 + "          " + quantity1 + "       " + "$" + (quantity1 * price2));
        }
        if (item1 == 125) {
            priceA = price3;
            System.out.println(" " + ID3 + "          " + quantity1 + "       " + "$" + (quantity1 * price3));
        }
        if (item1 == 126) {
            priceA = price4;
            System.out.println(" " + ID4 + "          " + quantity1 + "       " + "$" + (quantity1 * price4));
        }
        if (item1 == 127) {
            priceA = price5;
            System.out.println(" " + ID5 + "          " + quantity1 + "       " + "$" + (quantity1 * price5));
        }
        if (item2 == 123) {
            priceB= price1;
            System.out.println(" " + ID1 + "          " + quantity2 + "       " + "$" + (quantity2 * price1));
        }
        if (item2 == 124) {
            priceB = price2;
            System.out.println(" " + ID2 + "          " + quantity2 + "       " + "$" + (quantity2 * price2));
        }
        if (item2 == 125) {
            priceB = price3;
            System.out.println(" " + ID3 + "          " + quantity2 + "       " + "$" + (quantity2 * price3));
        }
        if (item2 == 126) {
            priceB = price4;
            System.out.println(" " + ID4 + "          " + quantity2 + "       " + "$" + (quantity2 * price4));
        }
        if (item2 == 127) {
            priceB = price5;
            System.out.println(" " + ID5 + "          " + quantity2 + "       " + "$" + (quantity2 * price5));
        }
        if (item3 == 123) {
            priceC = price1;
            System.out.println(" " + ID1 + "          " + quantity3 + "       " + "$" + (quantity3 * price1));
        }
        if (item3 == 124) {
            priceC = price2;
            System.out.println(" " + ID2 + "          " + quantity3 + "       " + "$" + (quantity3 * price2));
        }
        if (item3 == 125) {
            priceC = price3;
            System.out.println(" " + ID3 + "          " + quantity3 + "       " + "$" + (quantity3 * price3));
        }
        if (item3 == 126) {
            priceC = price4;
            System.out.println(" " + ID4 + "          " + quantity3 + "       " + "$" + (quantity3 * price4));
        }
        if (item3 == 127) {
            priceC = price5;
            System.out.println(" " + ID5 + "          " + quantity3 + "       " + "$" + (quantity3 * price5));
        }
        System.out.format("Total \t\t  %d\t\t  $%.2f ",(quantity1+quantity2+quantity3),price1*quantity1+price2*quantity2+price3*quantity3);
    }
}
