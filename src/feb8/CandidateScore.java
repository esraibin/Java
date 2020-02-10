package feb8;
import java.util.Scanner;
public class CandidateScore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age =  scanner.nextInt();
        System.out.println("Please enter your Java Point");
        int JavaPoint = scanner.nextInt();


        if((age > 19 && age <31 ) && (JavaPoint > 79)){
            System.out.println((age*1.5)+(JavaPoint* 4.5));
        }
        else if ((age > 19 && age <31 ) && (JavaPoint<80)){
            System.out.println(age*1.5+JavaPoint* 3.5);
        }
        else if((age > 30) && (JavaPoint >79)){
        System.out.println((age*1.1)+(JavaPoint* 4.5));
        }
        else{
            System.out.println((age*1.1)+(JavaPoint* 3.5));
        }
    }
}

