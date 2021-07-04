package Default;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        RemoveDuplicatesInPlace r = new RemoveDuplicatesInPlace();
        System.out.println(r.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
