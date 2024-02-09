/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    
    public static String uniqueChars(String s) {
        String unique = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                unique += s.charAt(i);
            }
            else if (s.charAt(i) == ' ') {
                unique += s.charAt(i);
            }

        }
        return unique;
    }
}