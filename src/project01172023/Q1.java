package project01172023;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int []arr=new int[4];
        int i=0;
        int sum=0;
        while (i<arr.length){

            arr[i]=scan.nextInt();
            sum=sum+arr[i];
            i++;
        }
        System.out.println("Total sum of the stored elements are "+sum);



    }
}
