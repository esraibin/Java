package feb12;

public class HelloOtherLoop {//it is not printing this part
    public static void main(String[] args) {
        for( int i = 1 ; i<1 ; i++){
            System.out.print("Hello");
            for( int j= 1 ; i<4 ; i++){
                System.out.println("World");
            }

        }

        for (int i = 0; i <1 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print("HEllo");

            }
            System.out.print("WOrld");

        }
    }
}
