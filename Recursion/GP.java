package Recursion;

public class GP {

    public static void main(String[] args) {

        System.out.println(findGeometricSum(4));


    }

    public static double findGeometricSum ( int k){
        // Write your code here

        return helper(k,0.0,0);

    }

    private static double helper(int k, double sum, int times) {


        if(times-1==k){
            return sum;
        }

        sum=sum+(1/Math.pow(2,times));

        return helper(k, sum, times+1);



    }
}