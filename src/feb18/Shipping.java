package feb18;
import java.util.Scanner;
public class Shipping {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter weight :  lps");
        int weight = 0;
        weight = scanner.nextInt();
        if (weight > 0 && weight <= 5){
            weight = 12;
        }
        else if (weight >5 && weight<=12){
            weight =29;
        }
        else if (weight> 12){
            weight = 50;
        }
        else{
            System.out.println("Entery should be at least 1 pound");
        }

        System.out.println("Please enter the volume : pt");
        int volume = scanner.nextInt();
        if(volume >=5 && volume <11){
            volume = 20;
        }
        else if(volume>10 && volume<=20 ){
            volume = 45;
        }
        else {
            System.out.println("Volume entered should be 5-20 pt");
        }

        System.out.println("Please enter the distnce : mile");
        int distance = scanner.nextInt();

        System.out.println("Ground shipping price is $ "+(((weight*volume)/11)*distance/100)+" Urgent shipping is $"+(((weight*volume)/5)*distance/100));
    }
}
