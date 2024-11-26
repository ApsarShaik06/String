import java.util.Scanner;

public class StringPalindrome{

    public static boolean isPalindrome(String str){
         for(int i=0; i<str.length(); i++){
            
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                // If any char is not same then will return false.
                  return false;
            }

         }

         return true;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String S = sc.next();

      boolean ans = isPalindrome(S);
      System.out.println("The given \""+S+"\" is Palindrome? "+"\n"+ans);
      /* Output
       * racecar (User needs to enter string)
       * The given "racecar" is Palindrome?
       * true
       */
    }
}
