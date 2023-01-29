package JAVA.Arrays;
/**
 * Merge2Arrays
 */

public class Merge2Arrays {

    public static void main(String[] args) {
        int arr1[] = { 6, 7, 8, 9 };
        int arr2[] = { 3, 4, 5 };

        int arr3[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k =0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }

        while(i<arr1.length){
            arr3[k]=arr1[i];
            k++;
            i++;
        }

        while(j<arr2.length){
            arr3[k]=arr1[i];
            k++;
            j++;
        }

        for (int k2 = 0; k2 < arr3.length; k2++) {
            System.out.print(arr3[k2]+ " ");
        }
    }

}