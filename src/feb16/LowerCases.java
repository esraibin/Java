package feb16;

public class LowerCases {
    public static void main(String[] args) {
        String sentence="I never Forget to push my Codes to GitHub?";
        //System.out.println(sentence.toUpperCase()); method to all uppercase
        //System.out.println(sentence.toLowerCase()); method to all lowercase

        for (int i = 0; i < sentence.length() ; i++) {
            if(sentence.charAt(i)>= 97 && sentence.charAt(i)<= 122 || sentence.charAt(i) == ' '){
                System.out.print(sentence.charAt(i));
            }

            }

        }
    }

