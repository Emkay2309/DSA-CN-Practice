package JAVA.Recursion.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,8};

        System.out.println(Search(arr,0,17));
    }

    public static boolean Search(int [] arr, int i,int j){

        if(arr.length==i){
            return false;
        }


        return arr[i]==j || Search(arr,i+1,j);
    }
}
