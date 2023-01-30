package homework01282023;

public class Task2 {
String  evenOrOdd(int num){

    if (num%2==0){
       return "Even number";
    }else {
      return "Odd number";
    }
}
    public static void main (String[] args){

      Task2 obj=new Task2();

        System.out.println(obj.evenOrOdd(10));




    }
}
