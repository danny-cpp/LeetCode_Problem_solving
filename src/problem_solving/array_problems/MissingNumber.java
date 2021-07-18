package problem_solving.array_problems;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    private int findMax(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] cache = new int[nums.length+1];

        for (int num : nums) {
            cache[num] = 1;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < nums.length+1; i++) {
            if (cache[i] == 0) {
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1};
        MissingNumber m = new MissingNumber();
        System.out.println(m.findDisappearedNumbers(arr));
    }
}
