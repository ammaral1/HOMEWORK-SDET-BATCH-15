package homework12182022;

import java.util.Scanner;

public class CreditCardProgram {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a credit card? ");
        boolean credit=scan.nextBoolean();

        if (credit){
            System.out.println("What is your balance");
            double balance=scan.nextDouble();
            if (balance>1000){
                System.out.println("Must pay now!");
            }else {
                System.out.println("You can spend more");
            }

        }else {
            System.out.println("We offer you a credit card");
        }
    }
}
