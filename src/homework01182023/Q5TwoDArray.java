package homework01182023;

import java.util.Arrays;

public class Q5TwoDArray {
    public static void main(String[] args) {

     int [][]twoD=new int [3][];
    int [] oneD1={1,2,3,4};
    int [] oneD2={5,6,7,8};
    int [] oneD3={9,10,11,12};

    twoD[0]=oneD1;
    twoD[1]=oneD2;
    twoD[2]=oneD3;
    for (int i=0;i<twoD.length;i++) {

        for (int j=0;j< twoD[i].length;j++){

            if (twoD[i][j]%2==0) {

                System.out.println(twoD[i][j]);
            }
            }
        }




    }







    }
