package project01172023;

public class Q5 {
    public static void main(String[] args) {


        int [][] twoDArray={{1,2,3}, {4, 4}, {2,2,2}};
        int sumEven=0;
        int sumOdd=0;
        for (int []oneDArray: twoDArray){
            for (int x: oneDArray)
            {
             if (x%2==0){
                 sumEven=sumEven+x;
             }   else {

                 sumOdd=sumOdd+x;
             }

            }
        }
        System.out.println(" Sum of even numbers is "+sumEven);
        System.out.println(" Sum of odd numbers is "+sumOdd);

    }}