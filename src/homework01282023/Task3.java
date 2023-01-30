package homework01282023;

public class Task3 {

    String palindromeMethod(String word){
        String reverseStr="";
        for (int i=word.length()-1;i>=0;i--){
          reverseStr += word.charAt(i);
        }
        if (word.equals(reverseStr)){
            return "Given String IS palindrome";
        }else{
            return "Given String IS NOT palindrome";
        }
    }
    public static void main (String[] args){
        Task3 obj=new Task3();
        System.out.println(obj.palindromeMethod("madam"));

    }
}
