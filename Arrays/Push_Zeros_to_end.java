package JAVA.Arrays;

/**
 * Push_Zeros_to_end
 * 2 0 0 1 3 0 0 - > 2 1 3 0 0 0 0
 */
public class Push_Zeros_to_end {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 0, 1, 3, 0, 0 };

        int i = 0;
        int pos = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;

            }
            i++;

        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}