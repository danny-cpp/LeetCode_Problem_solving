package problem_solving.array_problems;

import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximum {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        if (nums.length == 2) {
            return nums[nums.length-1];
        }

        return nums[nums.length-3];
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        ThirdMaximum t = new ThirdMaximum();
        System.out.println(t.thirdMax(arr));
    }
}
