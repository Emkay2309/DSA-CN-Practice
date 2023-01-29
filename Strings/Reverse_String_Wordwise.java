package JAVA.Strings;

/**
 * Reverse_String_Wordwise
 */
public class Reverse_String_Wordwise {
    public static void main(String[] args) {
        String s = "HELLO WORLD! two";
        String str = "";
        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                int end = i;
                String rev = "";

                while (start < end) {
                    rev = s.charAt(start) + rev;
                    start++;
                }
                str += rev + " ";
            }
        }
        String rev = "";

        while (start < s.length()) {
            rev = s.charAt(start) + rev;
            start++;
        }

        str += rev;
        System.out.println(str);
    }

}