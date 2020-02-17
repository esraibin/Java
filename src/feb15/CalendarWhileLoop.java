package feb15;

public class CalendarWhileLoop {
    public static void main(String[] args) {
        int month = 1;
        int day; // day declared in here

        while(month <= 12){
            day = 1; // day initilazed here
            while(day <= 30){
                System.out.println(month+"/"+day+"/2020");
                day++;

            }
            month++;
            System.out.println("   ");
        }
    }
}
