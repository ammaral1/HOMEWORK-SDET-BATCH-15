package homework01182023;

import java.util.Arrays;

public class Q4TwoDArray {
    public static void main(String[] args) {

        int [][]arr={{1,2,3}, {10,20,30}, {7, 9, 2}};
        int sum=0;

        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr[i].length;j++){

               sum=sum+arr[i][j];
            }

        }
        System.out.println(sum);




    }
}
