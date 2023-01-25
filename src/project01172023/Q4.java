package project01172023;

public class Q4 {
    public static void main(String[] args) {

        int [][] arr={{1,2,3,4}, {5,6,7}, {8,9} };

        for (int [] oneDArray: arr){
            for (int eachValue: oneDArray){
                if (eachValue%2==0){

                    System.out.println(eachValue);
                }

            }

        }

    }}