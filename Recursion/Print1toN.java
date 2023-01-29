package JAVA.Recursion;

import JAVA.OOPS.Polynomial.Polinomial;

public class Print1toN {

    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int i) {
        if (i==0){
            return;
        }

        System.out.print(i + " ");
        fun(i-1);
        System.out.print(i + " ");
    }


}
