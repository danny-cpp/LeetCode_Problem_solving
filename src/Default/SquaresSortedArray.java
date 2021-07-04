package Default;

import java.util.Arrays;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        SquaresSortedArray s = new SquaresSortedArray();
        System.out.println(Arrays.toString(s.sortedSquares(arr)));
    }
}
