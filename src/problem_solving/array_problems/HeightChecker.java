package problem_solving.array_problems;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            sorted[i] = heights[i];
        }

        Arrays.sort(sorted);

        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        HeightChecker h = new HeightChecker();
        System.out.println(h.heightChecker(arr));
    }
}
