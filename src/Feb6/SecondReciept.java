package Feb6;
import java.util.Scanner;
public class SecondReciept {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First ItemId : ");
        int item1 = scanner.nextInt();
        System.out.println("Please enter  First Quantity");
        int Quantity1 = scanner.nextInt();


        System.out.println("Please enter Second ItemId : ");
        int item2 = scanner.nextInt();
        System.out.println("Please enter  Second Quantity2");
        int Quantity2 = scanner.nextInt();


        System.out.println("Please enter third item Id : ");
        int item3 = scanner.nextInt();
        System.out.println("Please enter quantity3");
        int Quantity3 = scanner.nextInt();

        float Id123 = 2.49f;
        float Id124 = 4.79f;
        float Id125 = 1.65f;
        float Id126 = 7.88f;
        float Id127 = 0.99f;


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


        //System.out.format("Total\t\t\t\t%d \t\t\t %d",(Quantity1+Quantity2+Quantity3),);




    }
}
