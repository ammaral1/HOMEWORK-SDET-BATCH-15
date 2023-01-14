package homework01072023;

import java.util.Scanner;

public class FourthQuestionBirth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your month");
        String month;
        month = scan.next();
        if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("You were born in Summer");
        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
            System.out.println("You were born in Fall");
        } else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
            System.out.println("You were born in Winter");
        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("may")) {
            System.out.println("You were born in Spring");
        }
    }}