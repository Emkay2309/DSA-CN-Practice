package JAVA.Arrays;

/**
 * Second_Largest
 */
public class Second_Largest {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 5 };

        int first = arr[0];
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println(second);
    }

}