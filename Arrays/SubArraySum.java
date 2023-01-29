package Arrays;

/**
 * SubArraySum zero
 */
public class SubArraySum {

    public static void main(String[] args) {
        int arr[] = {0,2,4,-1,-3,4,-5,5};
        int sum = arr[0];

        int arr2[] = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr2[i] = sum;
        }

        //arr2 = {0,2,6,5,2,6,1,6}

        for (int i = 0; i < arr2.length-1; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if(arr2[i]-arr2[j]==0){
                    System.out.println(i+1 + " "+ j);
                }
            }
        }
        
    }
}