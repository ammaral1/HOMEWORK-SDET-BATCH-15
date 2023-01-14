package homework12182022;

public class LoanSpecialistProgram {
    public static void main(String[] args) {
        double loanAmount=20000;

        if (loanAmount<=200000){
            System.out.println("we will lend the money");
        }else {
            System.out.println("The loan is rejected due to larger amount! ");
        }
    }
}
