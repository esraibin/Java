package feb16;

public class NumbersNestedLoop { //print 10-99 with 2 loop
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print(i);
                System.out.print(j);// or we can do sout(i+""+j);
                System.out.println();
            }
        }
    }
}
