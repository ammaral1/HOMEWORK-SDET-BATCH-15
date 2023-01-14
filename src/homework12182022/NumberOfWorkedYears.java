package homework12182022;

import java.util.Scanner;

public class NumberOfWorkedYears {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("What is the total number of worked years?");
        double workedYears= scan.nextDouble();

        if (workedYears>=5){
            System.out.println("What is your annual salary?");
            int salary=scan.nextInt();

            if (salary>50000){
                System.out.println("user BONUS is 5000");
            }else {
                System.out.println("user BONUS is 3000");
            }

        }else {
            System.out.println("user is not eligible for bonus");
        }


    }
}
