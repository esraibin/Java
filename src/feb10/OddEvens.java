package feb10;

public class OddEvens {
    public static void main(String[] args) {
        for (int i = 100 ; i > 0 ; i--){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
        for(int i = 2000 ; i > 999 ; i-=2){
            System.out.println(i);
        }

    }
}
