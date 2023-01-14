package homework01072023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeQuestion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your grade");
       /* char grade;
        grade=scan.next().charAt(0);

                if (grade == 'A'){
            System.out.println(grade+" is Excellent");
        }else if (grade == 'B'){
            System.out.println(grade+" is Good");
        }else if (grade == 'C'){
            System.out.println(grade+" is Average");
        }else if (grade == 'D'){
            System.out.println(grade+" is BAD");
        }else {
            System.out.println(grade+" is Not Acceptable");
        }*/
        String grade;
        grade=scan.next();
        grade=grade.toLowerCase();

        if (grade.equals("a")){
            System.out.println(grade+" is Excellent");
        }else if (grade.equals("b")){
            System.out.println(grade+" is Good");
        }else if (grade.equals("c")){
            System.out.println(grade+" is Average");
        }else if (grade.equals("d")){
            System.out.println(grade+" is BAD");
        }else {
            System.out.println(grade+" is Not Acceptable");
        }


    }
}
