package project01172023;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {

        int [] arr={23, 4,67, 800, 91,2};
        int maxNum=arr[0];
        int minNum=arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]>maxNum){
                maxNum=arr[i];
            }
            if (arr[i]<minNum){
                minNum=arr[i];
            }
        }
        System.out.println("Max number is "+maxNum);
        System.out.println("Min number is "+minNum);




    }}


