public class Noble {

    /*
     * Count of noble elements


Noble elements = If count of number of elements less than itself and == equal to itself .

Ex- {0,-3,2,5};

0 elements less than -3

1 element less than 0

2 elements less than 2 (i.e. -3 and 0) . . .2 = 2 (noble element)

3 elements less than 5 (i.e. -3 and 0 and 2)


     */
    public static void main(String[] args) {
        int[] arr = {0,-3,2,5};

        for (int i = 0; i < arr.length-1; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }

            if(count<=arr[i]){
                System.out.println(arr[i] + " is noble");
            }
        }
    }
}
