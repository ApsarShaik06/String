import java.util.Scanner;

public class StringPalindrome{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name1 = "Apsar";
        String name2 = "Apsar";
        String name3 = new String("Apsar");

        // we are comparing the above variables.
        if(name1 == name2){
            System.out.println("The given names are same.");
        } else {
            System.out.println("The given names are not same.");
        }

        if(name1 == name3){
            System.out.println("The given names are same.");
        } else {
            System.out.println("The given names are not same.");
        }

        System.out.println(name1.hashCode() +" Address of name 1 :"+System.identityHashCode(name1));
        System.out.println(name2.hashCode() +" Address of name 2 :"+System.identityHashCode(name2));
        System.out.println(name3.hashCode() +" Address of name 3 :"+System.identityHashCode(name3));

        /**
         * The out put for above code is :
         * The given names are same.
         * The given names are not same.
         * 63479093 Address of name 1 :521960438
         * 63479093 Address of name 1 :521960438
         * 63479093 Address of name 1 :556529265
         */
    }
}
