package feb8;

import java.sql.SQLOutput;

public class StringCompare3 {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "c" ;
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        //it checks char value a = 97 and c is 99
    }
}
