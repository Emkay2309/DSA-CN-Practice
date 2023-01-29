package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int a[] ={1,2,3};
        int b[] ={2,3,4};
        int n = a.length;
        int m = b.length;

        
        int [] arr = new int[n+m];
        int i=0 ; 
        for(;i<n ; i++){
            arr[i]=a[i];
        }

       
        int k=0;
         for(;i<arr.length;i++){
            arr[i]=b[k];
            k++;
        }

        Arrays.sort(arr);

        int count =1;
        

        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j]!=arr[j+1]){
                count++;
            }
        }

        System.out.println(count);
    }
    
}
