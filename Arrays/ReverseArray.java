package Arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        //int arr [] =  { 1, 2, 3, 4, 5 ,6};

        // Create the Array List
        ArrayList<Integer> ArrList = new ArrayList<Integer>();
 
        // add the values in Array List
        ArrList.add(1);
        ArrList.add(2);
        ArrList.add(3);
        ArrList.add(4);
        ArrList.add(5);

        int k = 2;
        int i = 0;
        int end = ArrList.size()-1;

        while (i < k) {
            //int temp = arr[i];
            //arr[i] = arr[k - 1];
            //arr[k - 1] = temp;

            Collections.swap(ArrList, i, k-1);
            i=i+k;
            k--;
        }

        i = i + 1;

        while (i < end) {
            //int temp = arr[i];
            //arr[i] = arr[end];
            //arr[end] = temp;

            Collections.swap(ArrList, i, end);
            i++;
            end--;
        }

        System.out.println(ArrList);
    }
}