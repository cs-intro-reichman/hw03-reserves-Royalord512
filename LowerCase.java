/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   
    public static String lowerCase(String s) {
        
        String lowered = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch += 32;
            }
            lowered += ch;
        }
        return lowered;
    }
}