package homework01182023;

import java.util.Arrays;

public class Q2TwoDArray {
    public static void main(String[] args) {
        String [][]arr={{"Ford", "GMC", "Dodge", "Chrysler"}, {"Toyota", "Honda", "Mitsubishi"}, {"Kia", "Hyundai", "Genesis"}, {"Fiat", "Ferrari", "Alfa Romeo"}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("***********************");
        for (String[] x: arr){
            System.out.println(Arrays.toString(x));

        }
        System.out.println("****SECOND WAY******");

        for (String [] cars: arr){
            for (String x: cars){
                System.out.print(x+" ");

            }
            System.out.println();
        }


    }
}
