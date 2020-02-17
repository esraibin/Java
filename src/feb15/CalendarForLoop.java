package feb15;

public class CalendarForLoop {
    public static void main(String[] args) {
        for (int month = 1; month < 13; month++) {
            System.out.println("Month : "+month+"\n_______________");//shows month
            for (int day = 1; day <31 ; day++) {
                System.out.println(month+"/"+day+"/2020");
            }
            if(month!= 12){ //if provide not writing --- at the end
            System.out.println("- - - - - - - - - - - - -");
            }

        }
}
}
