package Arrays;

/**
 * leet code Ques 26. Remove Duplicates from Sorted Array
 */

public class RemoveDuplicates {

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}