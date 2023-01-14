package homework01072023;

import java.util.Scanner;

public class SecondQuestionWeekDays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a day by number between 1-7");
        int day;
        day =scan.nextInt();
        if (day>=1 && day<=5){
            System.out.println("Weekdays");
            }
        else if (day>=6 && day<=7){
            System.out.println("Weekend");
        }else {
            System.out.println("Invalid day");
        }

    }
}
