package feb15;

public class NumbersAndLetters {
    public static void main(String[] args) {

        for (int i = 1 ; i < 6 ; i++){
            System.out.print(i);
            for (char letter = 'a'; letter < 'e' ; letter++) {
                System.out.println("/t"+letter+"/t");
            }
            System.out.println();
        }
    }
}
