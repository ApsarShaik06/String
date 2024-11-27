public class stringBuilder {
    
    public static String toupperCase(String word){
         StringBuilder sb = new StringBuilder("");
         char ch = Character.toUpperCase(word.charAt(0));
         sb.append(ch);
         for(int i=1; i<word.length(); i++){
             if(word.charAt(i) == ' '){
                sb.append(word.charAt(i));  // If we found space, will append thet space 
                i++; // Increase i by 1 to go to next char
                sb.append(Character.toUpperCase(word.charAt(i))); // appending the upperCase of that char
             } else { // If no space fonud, then will appned that char asitis.
                sb.append(word.charAt(i));
             }
         }
         return sb.toString();
    }
    public static void main(String[] args) {
        String word = "apsar is good girl";
        String updatedWord = toupperCase(word);
        System.out.println(updatedWord);
    }
}
