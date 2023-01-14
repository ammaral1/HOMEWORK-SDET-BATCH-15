package homework12182022;

public class LoanAndMortgageProgram {
    public static void main(String[] args) {
        double rate=4.9;
        int mortgage=210000;

        if (rate>4.5){
            System.out.println("the rate is high so NOT to buy the house!");
        }else {
            System.out.println("The rate is good so you better consider buying a house");

            if (mortgage>200000){
                System.out.println("Take a loan");
            }else {
                System.out.println("Pay cash!");
            }
        }
    }
}
