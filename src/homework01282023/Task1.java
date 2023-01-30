package homework01282023;

public class Task1 {

    int largerNumber(int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }

    }

    public static void main (String[] args){

        Task1 obj=new Task1();
        System.out.println(obj.largerNumber(10,6));


    }
}
