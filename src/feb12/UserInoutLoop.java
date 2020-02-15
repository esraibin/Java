package feb12;
import java.util.Scanner;
public class UserInoutLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter beginning value");
        int begin = scanner.nextInt();
        System.out.println("Please enter end value");
        int end = scanner.nextInt();
        System.out.println("Please enter  what to print");
        String print = scanner.next();
        for (int i = begin; i < end; i++) {

            System.out.println(print);

        }
    }
}


