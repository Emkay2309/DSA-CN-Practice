package JAVA.Arrays;

/**
 * Check_Array_Rotation
 */
public class Check_Array_Rotation {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                count++;

            } else {
                break;
            }

        }

        if (arr.length == 0 || arr.length == count) {
            count = 0;
        }

        System.out.println(count);

    }
}