package Default;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        MoveZeros m = new MoveZeros();
        m.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
