package homework01072023;

import java.util.Scanner;

public class EightsQuestionCalculator {
    public static void main(String[] args) {

        //FIRST VERSION IS BELOW
 /*       Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers and operator");
        double number1, number2;
        char operator;
        number1=scan.nextDouble();
        number2=scan.nextDouble();
        operator=scan.next().charAt(0);

        if (operator =='+'){
            System.out.println(number1+number2);
        }else if(operator == '-'){
            System.out.println(number1-number2);
        }else if (operator == '*'){
            System.out.println(number1*number2);
        }else if (operator == '/'){
            System.out.println(number1/number2);
        }*/
        //SECOND VERSION IS BELOW
        //BOTH VERSIONS WORKS PROPERLY
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers and operator");
        double number1, number2;
        String operator;
        number1=scan.nextDouble();
        number2=scan.nextDouble();
        operator=scan.next();

        if (operator.equals("+")){
            System.out.println(number1+number2);
        }else if(operator.equals("-")){
            System.out.println(number1-number2);
        }else if (operator.equals("*")){
            System.out.println(number1*number2);
        }else if (operator.equals("?")){
            System.out.println(number1/number2);
        }
    }
}
