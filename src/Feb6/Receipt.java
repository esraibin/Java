package Feb6;
import java.util.Scanner;
public class Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First ItemId : ");
        float item1 = scanner.nextInt();
        System.out.println("Please enter  First Quantity");
        float Quantity1 = scanner.nextInt();

        System.out.println("Please enter Second ItemId : ");
        float item2 = scanner.nextInt();
        System.out.println("Please enter  Second Quantity2");
        float Quantity2 = scanner.nextInt();

        System.out.println("Please enter third item Id : ");
        float item3 = scanner.nextInt();
        System.out.println("Please enter quantity3");
        float Quantity3 = scanner.nextInt();


        float Id123 = 2.49f;
        float Id124 = 4.79f;
        float Id125 = 1.65f;
        float Id126 = 7.88f;
        float Id127 = 0.99f;

        int Quantity;
        double price;




        System.out.println("\t\t\t\t"+"WinDixie"              );
        System.out.println("ItemId\t\t"+"Quantity\t\t"+"Price");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - -");
        if (item1 == 123) {
            System.out.println("123\t\t\t\t"+Quantity1+"\t\t\t"+(Id123 * Quantity1));
        } else if (item1 ==124) {
            System.out.println("124\t\t\t\t"+Quantity1+"\t\t\t"+(Id124 * Quantity1));
        } else if (item1 ==125) {
            System.out.println("125\t\t\t\t"+Quantity1+"\t\t\t"+(Id125 * Quantity1));
        } else if (item1 ==126) {
            System.out.println("126\t\t\t\t"+Quantity1+"\t\t\t"+(Id126 * Quantity1));
        } else if (item1 ==127) {
            System.out.println("127\t\t\t\t"+Quantity1+"\t\t\t"+(Id127 * Quantity1));
        } else {
            System.out.println("Please enter valid Item Id");
        }


        if(item2 == 123){
            System.out.println("123\t\t\t\t"+Quantity2+"\t\t\t"+(Id123 * Quantity2));
        }
        else if (item2 == 124){
            System.out.println("124\t\t\t\t"+Quantity2+"\t\t\t"+(Id124 * Quantity2));
        }
        else if (item2 ==125) {
            System.out.println("125\t\t\t\t"+Quantity2+"\t\t\t"+(Id125 * Quantity2));
        }
        else if (item2 == 126){
            System.out.println("126\t\t\t\t"+Quantity2+"\t\t\t"+(Id126 * Quantity2));
            }
        else if (item2 == 127){
            System.out.println("127\t\t\t\t"+Quantity2+"\t\t\t"+(Id127 * Quantity2));
        }
        else {
            System.out.println("Please enter valid Item Id");
        }



        if(item3 == 123){
            System.out.println("123\t\t\t\t"+Quantity3+"\t\t\t"+(Id123 * Quantity3));
        }
        else if(item3 == 124){
            System.out.println("124\t\t\t\t"+ Quantity3+"\t\t\t"+(Id124 * Quantity3));
        }
        else if(item3 == 125){
            System.out.println("125\t\t\t\t"+Quantity3+"\t\t\t"+(Id125 * Quantity3));
        }
        else if(item3 == 126){
            System.out.println("126\t\t\t\t"+Quantity3+"\t\t\t"+(Id126 * Quantity3));
        }
        else if(item3 == 127){
            System.out.println("127\t\t\t\t"+ Quantity3+"\t\t\t"+(Id127 * Quantity3));
        }
        else {
            System.out.println("Please enter valid Item Id");
        }

        System.out.format("Total \t\t  %f\t\t  $%.2f ",(Quantity1+Quantity2+Quantity3),((item1*Quantity1)+(item2*Quantity2)+item3*Quantity3));


    }
}
