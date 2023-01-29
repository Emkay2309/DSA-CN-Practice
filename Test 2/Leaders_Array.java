public class Leaders_Array {
    public static void main(String[] args) {
        int input[] = { 3, 12, 34, 2, 0, -1 };

        for (int i = 0; i < input.length; i++) {

            int j = i + 1;
            while (j < input.length) {
                if (input[i] < input[j]) {
                    break;
                }
                j++;
            }

            if (j == input.length) {
                System.out.print(input[i] + " ");
            }

        }

    }
}
