public class stringBuilder {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        String s = "123";
        int n = Integer.parseInt(s);
        System.out.println("String to Int : "+n);
        int num = 456;
        String str = Integer.toString(num);
        System.out.println("int to string : "+str);
        String build = sb.toString();
        System.out.println("StringBuilder to string : "+build);
    }
}
