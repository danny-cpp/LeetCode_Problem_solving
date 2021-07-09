package Default;

import java.util.Arrays;

public class SortByParity {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        int j = 0;
        int k = len - 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 0) {
                res[j] = nums[i];
                j++;
            }
            else {
                res[k] = nums[i];
                k--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        SortByParity s = new SortByParity();
        System.out.println(Arrays.toString(s.sortArrayByParity(arr)));
    }
}
