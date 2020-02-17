package feb15;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;
        do{
            System.out.println("counter : "+counter);
            counter++;
        }
        while(counter <10);
        System.out.println("With while loop");
        while(counter<10){
            System.out.println(counter);
            counter++;
        }
    }
}
