package problem_solving.custom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class SumTwoIntegers {
    // Generate arr of random ints from 0 to 500
    public int[] generate() {
        int[] res = new int[100000000];

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

    // Checking in O(n) time
    public int[] hashMapCheck(int[] arr, int target) {
        HashMap<Integer, Integer> m = new HashMap<>(); // Array value : index

        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(target - arr[i])) {
                return new int[] {m.get(target - arr[i]), i};
            }
            else {
                m.put(arr[i], i);
            }
        }

        return new int[] {-1, -1};
    }


    public static void main(String[] args) {
        SumTwoIntegers s = new SumTwoIntegers();

        int[] arr = s.generate();
        // System.out.println(Arrays.toString(arr));

        long start1 = System.nanoTime();
        int[] res = s.referenceCheck(arr, 300);
        long end1 = System.nanoTime();
        System.out.println(Arrays.toString(res));
        System.out.println("O(n^2) takes " + (end1 - start1));

        long start2 = System.nanoTime();
        int[] res2 = s.hashMapCheck(arr, 300);
        long end2 = System.nanoTime();
        System.out.println(Arrays.toString(res2));
        System.out.println("O(n) takes " + (end2 - start2));

        System.out.println("values are: " + arr[res[0]] + " " + arr[res[1]]);
        System.out.println("values are: " + arr[res2[0]] + " " + arr[res2[1]]);
    }
}
