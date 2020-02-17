package feb16;

public class WhileVsDoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("We are in love with java");
        }
        while (false);

        boolean sentinel = true;
        while(sentinel){
            System.out.println("Noooo");
            sentinel = false;
        }
    }
}