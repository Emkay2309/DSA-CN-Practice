package JAVA.Recursion.Arrays;

public class SortArrays {

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5};

        System.out.println(Sort(arr,0));


    }

    private static boolean Sort(int[] arr, int i) {

        if(arr.length-1==i){
            return true;
        }

        return arr[i]<arr[i+1] && Sort(arr,i+1);
    }
}
