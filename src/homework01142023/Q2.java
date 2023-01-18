package homework01142023;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        for (n=1;n<=10;n++){
            System.out.println("Do you want to apply to credit card?");
            String ask=scan.next();
            if (ask.equals("yes")){
                break;
            }

        }



    /*Scanner scan=new Scanner(System.in);
       int n;
       while (true){

           System.out.println("enter a number between 1 and 10");
           n=scan.nextInt();
           if (n<1 || n>10){
               continue;
           }
           System.out.println(n+" is between 1 and 10");
           break;

       }
        int n;
        while (true){

            System.out.println("enter a number between 1 and 10");
            n=scan.nextInt();
            if (n<1 || n>10)
                continue;

            System.out.println(n+" is between 1 and 10");
            break;

        }*/
    }}

