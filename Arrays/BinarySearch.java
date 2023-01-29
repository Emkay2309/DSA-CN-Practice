package JAVA.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(binarySearch(arr, 3));
    }

    public static int binarySearch(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == i) {
                return mid;
            } else if (arr[mid] < i) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}