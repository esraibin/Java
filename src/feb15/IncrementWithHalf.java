package feb15;

public class IncrementWithHalf {
    public static void main(String[] args) {
        double a= 100;
        do{
            System.out.println(a);
            a -= 0.5;
        }
        while(a >= 0);
    }
}
