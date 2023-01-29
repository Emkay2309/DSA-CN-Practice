package JAVA.Arrays;

/**
 * Intersection Of Two Arrays
 * arr1 - 2 6 8 5 4 3
 * arr2 - 2 3 4 7
 * output - 2 4 3
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int arr1[] = { 2, 6, 8, 5, 4, 3 };
        int arr2[] = { 2, 3, 4, 7 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = 0;
                    break;

                }
            }
        }

    }

}