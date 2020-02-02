package secondpackage;

public class JavaIsFun {
    public static void main (String[] args){
        String java = "Java is fun";
        float percentageLarge = 78.98f;
        double percentageSmall = 78.980000;
        System.out.format("Do you think %s",java);
        System.out.format("\t Yes %% %f of the people think it is fun \n",percentageLarge);
        System.out.format ("\t Yes %% %.2f of the people think it is fun",percentageSmall);
    }

}
