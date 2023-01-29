package JAVA.Recursion.Strings;

public class RemoveX {

    public static void main(String[] args) {
        String s="00001020003400000000000";


        System.out.println(convertStringToInt(s));
    }
    public static String convertStringToInt(String input){
        // Write your code here
        return helper(input, 0, "",0);
    }

    public static String helper(String s, int i, String ans, int count) {

        if (i == s.length()) {

            return ans;
        }
        char ch = s.charAt(i);

        if (ch != '0' ) {
            count = count + 1;

        }
        if (count > 0) {
            ans += ch;
        }
        return helper(s, i + 1, ans,count);

    }
}
