package homework01152023;

public class Q6Array {
    public static void main(String[] args) {
        String[] countries = {"USA", "Iraq", "UK", "Canada", "Australia"};
        String []capitals={"DC", "Baghdad", "London", "Ottawa", "Melbourne"};



        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equalsIgnoreCase("USA")) {

                System.out.println("USA "+capitals[0]);
            } else if (countries[i].equalsIgnoreCase("Iraq")) {

                System.out.println("Iraq "+capitals[1]);
            } else if (countries[i].equalsIgnoreCase("UK" +
                    "")) {

                System.out.println("UK "+capitals[2]);

            } else if (countries[i].equalsIgnoreCase("Canada")) {

                System.out.println("Canada "+capitals[3]);
            } else if (countries[i].equalsIgnoreCase("Australia")) {

                System.out.println("Australia "+capitals[4]);

            }
        }
    }}
