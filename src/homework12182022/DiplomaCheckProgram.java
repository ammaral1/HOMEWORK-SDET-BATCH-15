package homework12182022;

public class DiplomaCheckProgram {
    public static void main(String[] args) {
        boolean diplomaDegree=true;
        double gpa=3.2;
        if (diplomaDegree){
            System.out.println("Congratulations");
            if (gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else {
                System.out.println("You should have studied harder!");
            }
        } else {
            System.out.println("You better get a degree!");
        }
    }
}
