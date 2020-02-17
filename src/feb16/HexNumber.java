package feb16;
public class HexNumber {
    public static void main(String[] args) {
        String number ="1241D343F";
        boolean hex =false;
        for (int i = 0; i < 9 ; i++){
            if(number.charAt(0) == 'A' ||number.charAt(i) == 'B' ||number.charAt(i) == 'C'||number.charAt(i) == 'D'||number.charAt(i) == 'E'|| number.charAt(i) == 'F'){
                hex=true;
            }
        }
        if(hex){
            System.out.println("Hexadecimal");
        }
        else{
            System.out.println("Not Hexadecimal");
        }
    }
}
