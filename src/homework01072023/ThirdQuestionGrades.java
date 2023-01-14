package homework01072023;

import java.util.Scanner;

public class ThirdQuestionGrades {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        System.out.println("Enter your scores which are quiz, mid term, and final score");
        int grade, quiz, midTerm, finalScore;
        quiz = fetch.nextInt();
        midTerm = fetch.nextInt();
        finalScore = fetch.nextInt();
        grade = (quiz + midTerm + finalScore) / 3;
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 70 && grade < 90) {
            System.out.println("B");
        } else if (grade >= 50 && grade < 70) {
            System.out.println("C");

        } else if (grade < 50) {
            System.out.println("F");
        } else {
            System.out.println("Invalid entry");
        }

    }
}
