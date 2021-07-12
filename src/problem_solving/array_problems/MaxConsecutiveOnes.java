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

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 1, 1, 1, 3, 1, 1, 8};
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        System.out.println(m.maxOneSequence(arr));
    }
}
