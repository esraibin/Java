package feb16;

public class NumbersLettersAlphabet {
    public static void main(String [] args){
        char letters = 'a';
        for(int i=1 ; i<=5 ; i++){
            System.out.print(i+"\t");
            for (int j = 0; j <4 ; j++) {
                System.out.print(letters+"\t");
                letters++; //provides abcd efgh structure without reseting
            }
            System.out.println();//move to curser to nextline after the inner loop

        }

    }
}
