package feb16;

public class WhileWhile {
    public static void main(String[] args) {
        int number = 1;
        int count = 0;
        char letters = 'a';
        while(number < 6){
            System.out.print(number+"\t");
            count = 0; //reset the count number for innerloop to work
            while(count < 4){
                System.out.print(letters+"\t");
                count++;
                letters++;

            }

            System.out.println();
            number++;

        }
    }
}
