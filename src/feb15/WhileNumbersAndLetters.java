package feb15;

public class WhileNumbersAndLetters {
    public static void main(String[] args) {
        char letter;
        int count;
        int number =1;

        while(number<6){
            count = 1;
            letter = 'a';
            System.out.print(number);
            while(count < 5){
                System.out.print("/t"+letter);
                count++;
                letter++;
            }
            System.out.println();
            number++;

            }

        }
    }

