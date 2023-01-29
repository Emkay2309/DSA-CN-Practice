package JAVA.Arrays;

/**
 * Sort_0s_1s_2s
 * 0 1 2 0 2 0 1 -> 0 0 0 1 1 2 2
 */
public class Sort_0s_1s_2s {

    public static void main(String[] args) {
        int[] arr = { 2, 2, 0, 1, 1 };
        int i = 0;
        int j = arr.length - 1;
        int pos = 0;

        while (i <= j) {
            if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }

            else if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
                i++;
            } else {
                i++;
            }

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}