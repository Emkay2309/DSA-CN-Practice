package JAVA.Recursion.Arrays;


public class AllIndicesOfNumber {

    public static void main(String[] args) {

        int arr[] = {1,33,33,4,5,33};
        int x =33;
        allIndexes(arr,x);


    }

    public static int[] allIndexes(int input[], int x) {

        return helper(input,x,0,0);
    }

    private static int [] helper(int[] A, int k, int i, int count) {
        if(i==A.length) {
            return new int [count];
        }
        if(A[i]==k) {
            int [] newArr = helper(A,k,i+1,count+1);


            newArr[count] = i;
            return  newArr;
        }
        else {
            int [] newArr = helper(A,k,i+1,count);
            return  newArr;
        }
    }
}