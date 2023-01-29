package JAVA.Arrays;

import java.util.Scanner;

/**
 * ArrangeNumbers
 */
public class ArrangeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int num = 1;
        int end = arr.length - 1;
        int start = 0;
        while (start < end) {
            arr[start] = num;
            num++;
            arr[end] = num;
            end--;
            num++;
            start++;
        }

        if (n % 2 != 0) {
            arr[n / 2] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}