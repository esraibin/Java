package feb16;

public class VowelsOnlyWhile {
    public static void main(String[] args) {
        String sentence = "Sunday is fun day";
        int index= 0;
        while(index< sentence.length()){

            if(!(sentence.charAt(index)=='u' || sentence.charAt(index)=='a' || sentence.charAt(index)=='i')) {
                System.out.println(sentence.charAt(index));
            }
            index++;

        }

    }
}
