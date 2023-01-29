package Patterns;

/**
 * Sum_Pattern
 * 1=1
 * 1+2=3
 * 1+2+3=6
 */
public class Sum_Pattern {

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            int j = 1;
            int sum = 0;
            while (j <= i) {
                System.out.print(j);
                if (i > j) {
                    System.out.print("+");
                }
                sum += j;
                j++;
            }
            i++;
            System.out.print("=" + sum);
            System.out.println();
        }
    }
}