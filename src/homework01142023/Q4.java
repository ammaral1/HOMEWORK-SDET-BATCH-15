package homework01142023;

import java.util.Scanner;
/*
       1) Write a program to ask a user to enter item they want to buy and the price of that item. User will
       be entering 5 items. Every time user enters price accumulate the price and tell the user how much
        totalPrice that they should pay.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"
         */
public class Q4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double totalPrice=0;
        for (int i=1;i<=5;i++){
            System.out.println("Enter item and the price!");
            String item=scan.next();
            double price=scan.nextDouble();
            totalPrice=totalPrice+price;
            System.out.println("Total price is "+totalPrice);
        }
        double change;
        double userPaid=scan.nextDouble();
        if (userPaid>totalPrice){
            change=userPaid-totalPrice;
            System.out.println("Here you are your change "+change);

        }else if   (userPaid<totalPrice){

            System.out.println("You can not buy all the items");
        }

        System.out.println("Thanks for shopping");


    }}

