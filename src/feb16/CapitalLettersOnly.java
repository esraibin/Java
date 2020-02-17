package feb16;

public class CapitalLettersOnly {
    public static void main(String[] args) {
        String sentence = "BootCamp Attendies Rocks";

        char letter;
        for (int i = 0; i <sentence.length() ; i++) {// to iteration
            letter = sentence.charAt(i);
            if(letter>=65 && letter <=90){ //to check is Capital letter
                System.out.println(sentence.charAt(i));
            }

        }
    }
}
