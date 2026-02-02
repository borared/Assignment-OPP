package w1.basic;

public class StringUtils {
    public static int length(String s){
        // your code here
        return s.length();
    }

    public static String toUpper(String s){
        // your code here
        return s.toUpperCase();
    }

    public static String reverse(String s){
        // your code here
        StringBuilder reversed = new StringBuilder();
        reversed.append(s);
        return reversed.reverse().toString();
    }

    public static int wordCount(String s){
        // your code here
        int count = 0;
        boolean isWord = false;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' ' && c!= '\n' && c != '\t'){
                if(!isWord){
                    isWord = true;
                    count++;
                }
            } else {
                isWord = false;
            }
        }
        return count;
    }
}
