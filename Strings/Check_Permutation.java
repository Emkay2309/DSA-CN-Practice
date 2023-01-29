package JAVA.Strings;

/**
 * Check_Permutation
 */
public class Check_Permutation {

    public static void main(String[] args) {
        String str1 = "sinrtg";
        String str2 = "striig";

        int[] freq = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }

}