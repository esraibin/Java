package feb15;

public class CalendarDoWhile {
    public static void main(String[] args) {
        int day;
        int month = 1;

        do{
            day = 1; // in this way value of day reset each time
            do{
                System.out.println(month+"/"+day+"/"+"2020");
                day++;

            }
            while(day<31);
        }
        while(month<13);
    }
}
