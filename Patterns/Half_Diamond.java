package Patterns;

/**
 * Half_Diamond
 * 
 * 
 * 
 * 1*
 * 121*
 * 12321*
 * 121*
 * 1*
 *
 * 
 */
public class Half_Diamond {

    public static void main(String[] args) {
        int n = 4;
        int i = 1;

        System.out.println("*");

        while (i <= n) {
            int j = 0;
            while (j <= 0) {
                System.out.print("*");
                j++;
            }

            j = 1;
            int pat = j;
            while (j < i) {
                System.out.print(pat++);
                j++;
            }

            j = 1;
            while (j <= i) {
                System.out.print(pat--);
                j++;
            }

            j = 0;
            while (j <= 0) {
                System.out.print("*");
                j++;
            }

            i++;
            System.out.println();
        }
        i=1;
        while(i<=n-1){
            int j = n-1;
            int pat = 1;

            System.out.print("*");
            while(j>=i){
                System.out.print(pat++);
                j--;
            }

            j=n-2;
            pat=pat-2;;
            while(j>=i){
                System.out.print(pat--);
                j--;
            }
            System.out.print("*");

            i++;
            System.out.println();
        }

        System.out.println("*");

    }
}