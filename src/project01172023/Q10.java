package project01172023;

public class Q10 {
    public static void main(String[] args) {

        int [] arr={23, 4,67, 800, 91,2};
        int maxNum=arr[0];
        int secondMaxNum=arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]>maxNum){
                maxNum=arr[i];
            }
        }
        for (int j=0;j<arr.length;j++){
            if(arr[j]==maxNum){
                continue;
        }else if (arr[j]>secondMaxNum){
                secondMaxNum=arr[j];
            }
    }
        System.out.println("SecondMax number is "+secondMaxNum);
    }}


