package homework01182023;

import java.util.Arrays;

public class Q6TwoDArray {
    public static void main(String[] args) {

        String [][]countries={{"USA", "Mexico", "Canada", "Guatemala", "Haiti", "Cuba", "Dominican Republic"},
                {"Brazil", "Argentina", "Colombia", "Peru", "Chile", "Ecuador"},
                {"Russia", "Germany", "United Kingdom", "France", "Italy"},
                {"Cambodia", "Indonesia", "Malysia", "Philippines", "Thailand", "China", "India"},
                {"Nigeria", "Ethiopia", "Egypt", "SouthAfrica", "Sudan", "Morocco", "Ghana"}  };
        int totalNum=0;

        for (int i=0;i< countries.length;i++){

            for (int j=0;j< countries[i].length;j++){
                totalNum=totalNum+1;

                System.out.print(countries[i][j]+" ");


            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total number of countries is "+totalNum);
        System.out.println("***************");
        int sum=0;
for (int k=0;k< countries.length;k++){

    sum=sum+ countries[k].length;
}
        System.out.println("Total Number of Countries is " +sum);
        System.out.println("****** the second printing method *******");

        for (int l=0;l< countries.length;l++){

            System.out.println(Arrays.toString(countries[l]));
        }

        System.out.println("*********second LOOP*************");
        for (int z=0;z< countries.length;z++){
            for (String x: countries[z]){

                System.out.print(x+" ");
            }
            System.out.println();

        }
        System.out.println("******the second loop*****");

        for (String[] continent: countries){
            for (String x: continent){
                System.out.print(x+" ");

            }
            System.out.println();

        }



            }
        }
