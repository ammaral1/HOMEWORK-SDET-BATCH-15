package homework01152023;

import java.sql.SQLOutput;

public class Q1Array {
    public static void main(String[] args) {
        char [] grades={'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println(grades[1]);

        char []grades2=new char[6];
        grades2[0]='A';
        grades2[1]='B';
        grades2[2]='C';
        grades2[3]='D';
        grades2[4]='E';
        grades2[5]='F';

        System.out.println(grades2[1]);
    }
}
