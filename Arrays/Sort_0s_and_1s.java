package JAVA.Arrays;

/**
 * Sort_0s_and_1s
 */
public class Sort_0s_and_1s {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 1, 0, 1, 0 };

        // int start = 0;
        int pos = 0;
        int end = arr.length - 1;

        while (pos < end) {
            if (arr[pos] == 1) {
                int temp = arr[pos];
                arr[pos] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                pos++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}