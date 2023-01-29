package Patterns;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int j =0;
            int num = i+14;
            while (j<=i) {
                System.out.print(num--);
                j++;
            }
            i++;
            System.out.println();
            

        }
    }
}
