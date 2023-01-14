package homework01082023;

public class WorkDayAndDayOff {
    public static void main(String[] args) {
        boolean workDay=true;
        int day=1;
        while (workDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else {
                System.out.println("I do not need a day off anymore");
                workDay=false;
            }
            day++;  // it is equal to day=day+1 day+=1
        }

     /* boolean workDay=true;
      int i=1;
      if (workDay){
      while (i<=5){
          System.out.println(i+ " I need a day off");
          i++;
      }
          System.out.println(i+" I do not need a day off");

      }*/

    }
}
