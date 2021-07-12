package problem_solving.array_basics;

import java.util.Arrays;

public class RemoveInPlace {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        RemoveInPlace r = new RemoveInPlace();
        System.out.println(r.removeElement(arr, 2));
        System.out.println(Arrays.toString(arr));
    }
}
