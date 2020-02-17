package feb16;

public class NumbersNestedLoopWhile {
    public static void main(String[] args) {

    int tens= 1;
    int ones = 0;

    while(tens<10){

        ones = 0;
        while(ones<10){

            System.out.println(tens+""+ones);
            ones++;
        }
        tens++;
        }
    }
}
