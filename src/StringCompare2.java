import java.sql.SQLOutput;

public class StringCompare2 {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";

        if (a.equals(b)){
            System.out.println("Hello");
        }
        String c = new String("x");
        String d = new String("x");

        if(c==d){
            System.out.println("World");
        }

    }
}
