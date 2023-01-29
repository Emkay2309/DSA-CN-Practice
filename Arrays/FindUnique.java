package JAVA.Arrays;

/**
 * FindUnique
 */
public class FindUnique {

    public static void main(String[] args) {
        //1 2 3 1 2 -> this should return 3

        //1 st method using BitManipulation

        int [] arr = {1,2,3,1,2,4,4,3,5};
        int unique=0;

        for (int index = 0; index < arr.length; index++) {
            unique^=arr[index];
        }

        System.out.println(unique);

        // second method using two for loops O(n^2)

        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }
            }

            if(count<2){
                System.out.println(arr[i]);
                return;
            }
        }



    }
}