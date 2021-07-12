package problem_solving.array_basics;

public class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int res = 0;

        for (int num : nums) {
            if (num == 1) {
                res++;
            } else {
                if (res > max) {
                    max = res;
                }
                res = 0;
            }
        }
        if (res > max) {
            max = res;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};

        ConsecutiveOnes c = new ConsecutiveOnes();
        System.out.println(c.findMaxConsecutiveOnes(arr));
    }
}
