package Arrays;

public class Leaders_Arrays {
    public static void main(String[] args) {
        int[] arr = { 3, 12, 34, 2, 0, -1 };

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            for (; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
            }
            if (j == arr.length) {
                System.out.println(arr[i]);
            }
        }
    }
}
