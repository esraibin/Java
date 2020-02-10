package feb8;
import java.util.Scanner;
public class PerimeterOfShapes {
    public static void main(String[] args) {
        //Creating Scanner object to read from keyboard
        Scanner myScan= new Scanner(System.in);
    System.out.println("Please enter C,R,T :");
    // Receiving answer from the user
        String shapes = myScan.next();

        if(shapes.compareToIgnoreCase("c")==0) {

        }
        else if (shapes.compareToIgnoreCase("r")== 0){

        }
        else if (shapes.compareToIgnoreCase("t")==0){

        }
        else{
            System.out.println("Please enter R,C or T");
        }
    }
}
