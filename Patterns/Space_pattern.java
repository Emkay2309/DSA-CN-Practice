package Patterns;

/**
 * Space_pattern
 */
public class Space_pattern {

    public static void main(String[] args) {
        int n =5;
        int i =1;
        while(i<=n){
            int j =4;

            while(j>=i){
                System.out.print(" ");
                j--;
            }
            j=1;
            while(j<=i){
                System.out.print(i);
                System.out.print(" ");
                j++;
            }
            
            i++;
            System.out.println();
        }
    }
}