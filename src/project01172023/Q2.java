package project01172023;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] countries = new String[3];
        int i = 0;
        while (i < countries.length) {

            countries[i] = scan.nextLine();
            i++;
        }
        System.out.println(Arrays.toString(countries));


        for (int j=0;j<countries.length;j++)
            if (countries[j].equalsIgnoreCase("USA")) {

                System.out.println("The capital of " + countries[j] + " is DC");
            }
            else if (countries[j].equalsIgnoreCase("Iraq")) {

                System.out.println("The capital of " + countries[j] + " is Baghdad ");
            } else if (countries[j].equalsIgnoreCase("Bahrain")) {

                System.out.println("The capital of " + countries[j] + " is Manama ");
            }
        System.out.println("***************");
        for (String x: countries){
            if (x.equalsIgnoreCase("USA")){

                System.out.println(" The capital of "+x+" is DC");
            }
            else if (x.equalsIgnoreCase("Iraq")) {

                System.out.println("The capital of " +x + " is Baghdad ");
            } else if (x.equalsIgnoreCase("Bahrain")) {

                System.out.println("The capital of " + x + " is Manama ");
            }

        }

    }}