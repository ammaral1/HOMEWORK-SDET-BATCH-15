package homework01072023;

import java.util.Scanner;

public class SeventhQuestionCountry {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your country");
        String country;
        country=scan.next();
        if (country.equalsIgnoreCase("USA")){
            System.out.println("English");
        }else if (country.equalsIgnoreCase("Japan")){
            System.out.println("Nihongo");
        }else if (country.equalsIgnoreCase("China")){
            System.out.println("Mandarin");
        }else if (country.equalsIgnoreCase("India")){
            System.out.println("Hindi");
        }else if (country.equalsIgnoreCase("Pakistan")){
            System.out.println("Urdu");
        }

    }
}
