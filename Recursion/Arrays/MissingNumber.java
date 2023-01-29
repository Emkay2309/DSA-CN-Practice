package JAVA.Recursion.Arrays;

import java.util.Arrays;

public class MissingNumber {

        public static void main(String args[]) {
            // Your code goes here
            int [] array = {1,2,3,5};
            int n = array.length;
            System.out.println(MissingNumber(array,n));
        }
        static int MissingNumber(int array[], int n) {
            // Your Code Here
            Arrays.sort(array);
            int ans = 0;
            for(int i=0 ; i<n-1 ; i++) {
                if((array[i] +1 )!= array[i+1]) {
                    ans = array[i]+1;
                }
            }
            return ans;
        }
    }

