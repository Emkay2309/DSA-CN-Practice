package JAVA.Strings;

/**
 * CheckPalindrome
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "momu";

        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i)+rev;
        }
        

    }
}