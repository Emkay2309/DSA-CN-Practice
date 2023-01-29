package JAVA.Arrays;

/**
 * Sum_of_Two_Arrays
 */
public class Sum_of_Two_Arrays {

    public static void main(String[] args) {
        int arr1[] = { 6, 7, 8, 9 };
        int arr2[] = { 3,4, 5 };

        int arr3[] = new int[5];
        int k = arr3.length-1;
    
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry=0;

        while (i >=0 && j>=0) {
            int sum = arr1[i]+arr2[j]+carry;
            arr3[k]= sum%10;
            carry=sum/10;           
            i--;
            j--;
            k--;     
        }

        while(i>=0){
            int sum = arr1[i]+carry;
            arr3[k]= sum%10;
            carry=sum/10;         
            i--;
            k--;     
        }

        while(j>=0){
            int sum = arr1[j]+carry;
            arr3[k]= sum%10;
            carry=sum/10;
            j--;
            k--;     
        }

        if(carry!=0){
            arr3[0]=carry;
        }

        

        for (int l = 0; l < arr3.length; l++) {
            System.out.print(arr3[l]+ " ");
        }

        
    }
}

