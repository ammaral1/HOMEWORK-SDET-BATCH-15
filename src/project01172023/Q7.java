package project01172023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);

    int numberToCheck=scan.nextInt();


boolean isPrime=true;
    for (int factor=2;factor<=numberToCheck/2;factor++){
        if (numberToCheck%factor==0){
            System.out.println(numberToCheck+" is NOT prime number ");
            isPrime=false;
            break;
        }


    }
    if (isPrime){

        System.out.println(numberToCheck+" is a Prime number");
    }

    }}


