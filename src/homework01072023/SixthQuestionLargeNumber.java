package homework01072023;

import java.util.Scanner;

public class SixthQuestionLargeNumber {
   public static void main(String[] args) {
      Scanner scan=new Scanner (System.in);
      System.out.println("Enter three numbers");
      int num1, num2, num3;
      num1=scan.nextInt();
      num2=scan.nextInt();
      num3=scan.nextInt();

      if (num1>num2){
         if (num1>num3){
            System.out.println("the largest number is "+num1);
         }

      }else if (num2>num1){
         if(num2>num3){
            System.out.println("The largest number is "+num2);
         }
      }else if(num3>num1){
         if (num3>num2){
            System.out.println("The largest number is "+num3);
         }
      }


      }
   }