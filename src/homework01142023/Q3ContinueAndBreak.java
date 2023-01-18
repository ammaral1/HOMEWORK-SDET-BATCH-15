package homework01142023;

import java.util.Scanner;

public class Q3ContinueAndBreak {
    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers start and end");

       int start=scan.nextInt();
       int end=scan.nextInt();
       int sumEven=0;
       int sumOdd=0;
       for (int i=start;i<=end;i++){
           if (i%2==0){
               sumEven=sumEven+i;

           }else{
               sumOdd=sumOdd+i;

           }

           }
        System.out.println("Sum of even numbers is "+sumEven+" sum of odd numbers is "+sumOdd);

       }

        }

