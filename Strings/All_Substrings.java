package JAVA.Strings;

/**
 * All_Substrings
 * abc -> a 
          ab 
          abc 
          b 
          bc 
          c 
 */
public class All_Substrings {

    public static void main(String[] args) {
        String s = "PQRS";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length()-i; j++) {
                int start = j;
                int end = i+j;
                System.out.println(s.substring(start,end+1));
            }
        }
    }
}