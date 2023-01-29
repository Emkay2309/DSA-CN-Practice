public class MinNumber {
    public static void main(String[] args) {
        int arr[] = {55,43,47};
        String a = "";


        //bubble sort 
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            a+=arr[i];
        }

        System.out.println(a);
        
    }
}
