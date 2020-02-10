package feb9;
import java.util.Scanner;
public class TotalPriceCar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
         int MSRP;
        if(model.equalsIgnoreCase("X")) {
            MSRP = 30000;
            System.out.println("Would you like to purchase Body Package Y/N");
            String Bodypackage = scanner.nextLine();
            if(Bodypackage.equalsIgnoreCase("y")){
                MSRP = MSRP + 5000;

            }

        }
    }
}
