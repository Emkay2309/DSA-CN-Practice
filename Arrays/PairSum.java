package JAVA.Arrays;

/**
 * PairSum
 */
public class PairSum {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 4, 5, 6 };
        int sum = 8;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}