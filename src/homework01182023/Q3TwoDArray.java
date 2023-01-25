package homework01182023;

import java.util.Arrays;

public class Q3TwoDArray {
    public static void main(String[] args) {
        String [][]grocery={{"Cilantro", "Tomato", "Onion"}, {"Apple", "Banana", "Kiwi", "Orange"}, {"Milk", "Cheddar ", "better"}, {"Cake", "Candy"}};

        for (int i=0;i< grocery.length;i++){

         for (int j=0;j< grocery[i].length;j++){

             System.out.print(grocery[i][j]+" ");
         }
         System.out.println();
     }
        System.out.println("******************");

        for (int k=0;k< grocery.length;k++) {


            System.out.println(Arrays.toString(grocery[k]));
        }

        System.out.println("******second loop******");

        for (String []type: grocery ){
            for (String x: type){

                System.out.print(x+" ");
            }
            System.out.println();

        }

     }





     }




