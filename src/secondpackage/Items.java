package secondpackage;

public class Items {
    public static void main(String[] args){
        double item1 = 1.99;
        double item2 = 2.49;
        System.out.format("\t\t\t\t\t Reciept\n");
        System.out.format("\t\t--------------------------\n");
        System.out.format("\t\titem 1\t:\t $%.2f\n",item1);
        System.out.format("\t\titem 2\t:\t $%.2f",item2);
        System.out.format("\nToday I am \"happy\"");
    }
}
