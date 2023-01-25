package project01172023;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        int [][] arr={{1,2,3,4}, {5,6,7}, {8,9} };
int sum=0;
        for (int row []: arr){
            for (int intValue: row ){
                sum=sum+intValue;

            }

        }
        System.out.println("The sum of all values is "+sum);
    }}