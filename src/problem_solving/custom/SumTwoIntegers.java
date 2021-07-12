package problem_solving.custom;

import java.util.Arrays;
import java.util.Random;

public class SumTwoIntegers {
    // Generate arr of random ints from 0 to 500
    public int[] generate() {
        int[] res = new int[100];

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            res[i] = r.nextInt(501);
        }

        return res;
    }

    // Checking if exists 2 numbers in an array sum up to a target O(n^2). Return indices
    public int[] referenceCheck(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        SumTwoIntegers s = new SumTwoIntegers();

        int[] arr = s.generate();
        System.out.println(Arrays.toString(arr));

        int[] res = s.referenceCheck(arr, 300);
        System.out.println(Arrays.toString(res));
        System.out.println("values are: " + arr[res[0]] + " " + arr[res[1]]);
    }
}
