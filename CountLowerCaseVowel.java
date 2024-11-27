public class lowerCaseVowels {
    public static int countOfLowerVowel(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            // checking if any character is smallCase vowel, then will increse the count.
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String s = "appleOragneyounoteggilove";
        System.out.println(countOfLowerVowel(s));
    }
}
