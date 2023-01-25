package project01172023;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        int firstNum=0;
        int secondNum=1;
        int fiboNum=0;

        int []arr=new int[10];

        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<10;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }


            System.out.println(Arrays.toString(arr));






    }}


