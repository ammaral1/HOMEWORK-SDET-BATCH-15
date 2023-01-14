package homework01072023;

import java.util.Scanner;

public class EnterPersonHeightHW {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your height in inches!");
        int height;
        height=scan.nextInt();
        if (height<60){
            System.out.println("Short");
        }else if (height>=60 && height<=70){
            System.out.println("medium");
        }else if (height>70){
            System.out.println("tall");
        }


    }
}
