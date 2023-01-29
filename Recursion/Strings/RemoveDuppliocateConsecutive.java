package Recursion.Strings;

public class RemoveDuppliocateConsecutive {
        public static void main(String[] args) {
            System.out.println(removeConsecutiveDuplicates("baabbsbbahsahbahshhbhsjjjj"));
    
        }
    
        public static String removeConsecutiveDuplicates(String s) {
            // Write your code here
    
            return helper(s, "", 1);
    
        }
    
        private static String helper(String s1, String s2, int i) {
    
            if (i == s1.length()) {
                return s1.charAt(0) + s2;
            }
    
            if (s1.charAt(i) != s1.charAt(i - 1)) {
                char ch = s1.charAt(i);
                s2 += ch;
                
                
            } 
    
            return helper(s1, s2, i +1);
        }
    
    }
