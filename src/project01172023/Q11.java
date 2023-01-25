package project01172023;

public class Q11 {
    public static void main(String[] args) {

       String []arr={"Apple", "Orange", "Strawberry", "Mango", "Orange", "Grapes", "Kiwi", "Orange", "Mango"};

        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                }
            }



        }


    }}


