package problem_solving.array_problems;

public class MaxConsecutiveOnes {
    public int maxOneSequence(int[] arr) {
        int res = 0;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
            }
            else {
                if (counter > res) {
                    res = counter;
                }
                counter = 0;
            }
        }

        if (counter > res) {
            res = counter;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        System.out.println(m.maxOneSequence(arr));
    }
}
