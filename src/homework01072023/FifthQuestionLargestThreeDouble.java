package homework01072023;

import java.util.Scanner;

public class FifthQuestionLargestThreeDouble {
   public static void main(String[] args) {
      Scanner scan=new Scanner (System.in);
      System.out.println("Enter three double numbers");
      double num1, num2, num3;
      num1=scan.nextDouble();
      num2=scan.nextDouble();
      num3=scan.nextDouble();
      if (num1>num2 && num1>num3){
         System.out.println(num1+" is the largest number");
      }else if (num2>num1 && num2>num3){
         System.out.println(num2+" is the greatest number");
      }else if (num3>1 && num3>num2){
         System.out.println(num3+ " is greatest number");
      }
   }
   }