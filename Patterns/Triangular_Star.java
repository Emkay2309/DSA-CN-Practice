package Patterns;

import java.util.Scanner;

public class Triangular_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
