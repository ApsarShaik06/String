import java.util.Arrays;
import java.util.Scanner;

public class Anagramz {
    /*
     Q:-  Determine if 2 Strings areanagramsof each other.
     What are anagrams?
         If two strings contain the same characters but in a different order,they can be said to be anagrams.
         Consider race and care.In this case,race's characters can be formed into a study, or care's characters can be formed into race.
         Below is a java program to check if two strings are anagrams or not.
    */
    public static boolean checkAnagram(String s1, String s2){
      
        // we are making all chars into lower case to avoid chekcing for lower and upper cases seperately.
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
 
        // checking the length, if the length same we can go ahed for furthur, if not we no need to check.
        if(s1.length() == s2.length()){
            // convesting into array of characters.
            char[] array1 = s1.toCharArray();
            char[] array2 = s2.toCharArray();

            // sorting the char arrays.
            Arrays.sort(array1);
            Arrays.sort(array2);

            // chekcing the arrays are same or not.
            if(Arrays.equals(array1, array2)){ 
                return true;
            }
        }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(checkAnagram(s1, s2)){
             System.out.println("Given strings are Anagram");
        } else{
            System.out.println("Given strings are not Anagram");
        }
    }
}
