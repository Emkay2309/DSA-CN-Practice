package JAVA.Arrays;

/**
 * InsertionSort
 */

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = { 6, 7, 4, 3, 2, 9 };
                            //j=3
                            //temp =2
                            //2,3,4,6,7
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {

                arr[j] = arr[j - 1];
                j--;

            }
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}