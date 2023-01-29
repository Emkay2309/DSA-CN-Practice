package Arrays;

import java.util.*;


public class Arraysortmedian {
    public static void main(String[] args) {
        int [] a = {1,3};
        int n = a.length;
        int b [] = {1};
        int m = b.length;

        int [] A = new int [n+m];
        int ans = 0;
        
        for(int i=0 ; i<n ; i++) {
            A[i] = a[i];
            ans++;
        }
        for(int j=0 ; j<m ; j++) {
            A[ans] = b[j];
            ans++;
        }
        
        Arrays.sort(A);
        
        int mid = (n+m)/2;
        
        if(A[mid]%2==0) {
            double value = (A[mid] + A[mid-1])/2;
            System.out.println(value);
        }
        else {
            System.out.println(A[mid]);
        }
    }
    
}
