package JAVA.Recursion;

public class Reverse {

    public static int sum = 0;
    public static void main(String args[]) {
        System.out.println(solve(1234));
        int temp =1234321;

        if(solve(1234321)==temp){
            System.out.println(true);
        }else{
            System.out.println(false);
        }





    }
    public static int solve(int N) {

        int digit = (int) (Math.log10(N)+1);

        return helper(N,digit);

    }

    private static int helper(int n, int digit) {

//        if(n==0){
//            return 0;
//        }

        if(n%10==n){
            return n;
        }

        int rem = n%10;

        return (int) (rem * Math.pow(10,digit-1))+ helper(n/10,digit-1);

    }
}