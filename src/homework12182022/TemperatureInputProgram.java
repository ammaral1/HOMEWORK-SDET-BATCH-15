package homework12182022;

import java.util.Scanner;

public class TemperatureInputProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your city? ");
        String city=scan.next();
        System.out.println("What is temperature?");
        double temperatureF=scan.nextDouble();
        double temperatureC= (0.5556)*(temperatureF-32);
        System.out.println("The temperature is " +temperatureC+" the city is "+city);





    }
}
