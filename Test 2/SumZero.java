public class SumZero {
    public static void main(String[] args) {
        int [] arr = {0,2,4,-1,-3,4,-5,5};
        int [] arr2 = new int[arr.length];

        arr2[0] = arr[0];

        for (int i = 1; i < arr2.length-1; i++) {
            arr2[i] = arr[i]+arr[i+1]; 
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
