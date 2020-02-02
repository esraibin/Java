package secondpackage;

public class FormatGrade {
    public static void main(String[] args){
        String student1 = "Ali";
        String  student2 = "Ayse";

        String grade1 = "A";
        String grade2 = "A-";
        System.out.format("\tName\t\t:\tGrade\n");
        System.out.format("  --------------------------\n");
        System.out.format("\tJohn\t\t:\tA\n");
        System.out.format("Kimberly\t\t:\tA\n\n\n");

        System.out.format("\tName\t\t:\tGrade\n");
        System.out.format("  --------------------------\n");
        System.out.format("%s\t\t:\t%s\n",student1,grade1);
        System.out.format("%s\t\t:\t%s\n",student2,grade2);

    }

}
