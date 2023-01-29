package Arrays;

import java.util.*;

/**
 * MedianOfArrays
 */
public class MedianOfArrays {

    public static void main(String[] args) {
        int array1[] = { 1, 2 };
        int array2[] = { 3, 4 };

        System.out.println(medianOfArrays(2, 2, array1, array2));

    }

    public static double medianOfArrays(int n, int m, int a[], int b[]) {

        int[] A = new int[n + m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            A[i] = a[i];
            ans++;
        }

        for (int j = 0; j < m; j++) {
            A[ans] = b[j];
            ans++;
        }

        Arrays.sort(A);

        int mid = A.length / 2;

        if ((n + m) % 2 == 0) {
            double value = (A[mid] + A[mid - 1]) / 2.0;
            return value;
        } else {
            return A[mid];
        }

    }
}