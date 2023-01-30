package homework01222023;

public class task3 {
    public static void main(String[] args) {

        String dadFirstName="Ammar";
        String momFirstName="Zainab";

        String expectation="boy";
        String firstHalf="";
        String secondHalf="";


        if (expectation.equals("boy")){
            firstHalf=dadFirstName.substring(0,dadFirstName.length()/2);
            secondHalf=momFirstName.substring(momFirstName.length()/2);


        }
        System.out.println(firstHalf+secondHalf);

    /*    else {
            firstHalf=dadFirstName.substring(0,dadFirstName.length()/2);
            secondHalf=momFirstName.substring(momFirstName.length()/2);
        }
*/


    }
}
