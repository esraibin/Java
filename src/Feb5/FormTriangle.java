package Feb5;
import java.util.Scanner;
public class FormTriangle {
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Please enter side1: ");
        int side1 = scanNumber.nextInt();
        System.out.println("Please enter side2: ");
        int side2 = scanNumber.nextInt();
        System.out.println("Please enter side3: ");
        int side3 = scanNumber.nextInt();


        if( (side1+side2 > side3) && (side1+side3 >side2) && (side2+side3> side1)){
            System.out.println("This is a triangle");
        }
        else {
            System.out.println("It can not form a triangle");
        }

        }

    }

