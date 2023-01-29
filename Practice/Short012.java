package Practice;

public class Short012 {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 2, 0, 1, 1, 0, 2 };

        int i = 0;
        int j = arr.length - 1;
        int k = 0;
        while (i < j) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;
            } else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                i++;
            }
        }

        for (int k2 = 0; k2 < arr.length; k2++) {
            System.out.println(arr[k2]);
        }
    }
}
