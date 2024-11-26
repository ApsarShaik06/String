public class LargestString {
    
    public static String findLargest(String[] fruits){
        String Largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
           if(Largest.compareTo(fruits[i]) < 0){ // if defined string is less then curr str then will get -e val.
               Largest = fruits[i]; // so we will assign the greater value to our defined largest.
           }
        }
        return Largest;
    }
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana"};
        System.out.println("The largest string is : "+findLargest(fruits)); 
    }
}
// Output --> The largest string is : mango
