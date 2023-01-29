/**
 * SingleDigit
 */
public class SingleDigit {

    public static void main(String[] args) {
        int i = 999;
        int sum = 0;

        while (i > 0) {
            int rem = i % 10;
            sum += rem;
            i = i / 10;

            if (sum > 9) {
                i = sum;
                sum = 0;
            }
        }

        System.out.println(sum);
    }

}