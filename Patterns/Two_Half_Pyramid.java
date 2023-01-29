package Patterns;

/**
 * Two_Half_Pyramid
 */
public class Two_Half_Pyramid {

    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            j = 3;
            while (j >= i) {
                System.out.print(" ");
                j--;
            }
            j = 3;
            while (j >= i) {
                System.out.print(" ");
                j--;
            }

            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
        i = 1;

        while (i <= n) {
            int j = 4;
            while (j >= i) {
                System.out.print("*");
                j--;
            }

            j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }

            j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }

            j = 4;
            while (j >= i) {
                System.out.print("*");
                j--;
            }

            i++;
            System.out.println();

        }
    }
}