package feb16;

public class StringVowel {
    public static void main(String[] args) {
        String myStr = "Java is Fun";
        for (int index = 0; index <myStr.length() ; index++) {
            if (myStr.charAt(index) == 'a' || myStr.charAt(index) == 'e'|| myStr.charAt(index) == 'o' || myStr.charAt(index) == 'u'|| myStr.charAt(index) == 'i'){

            System.out.println(myStr.charAt(index));
            }
        }

    }
}
