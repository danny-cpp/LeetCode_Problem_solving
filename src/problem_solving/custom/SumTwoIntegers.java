package problem_solving.custom;

import java.util.Arrays;
import java.util.Random;

public class SumTwoIntegers {
    public int[] generate() {
        int[] res = new int[100];

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            res[i] = r.nextInt(501);
        }

        return res
    }

    public static void main(String[] args) {
        SumTwoIntegers s = new SumTwoIntegers();
        int[] arr = s.generate();

        System.out.println(Arrays.toString(arr));
    }
}
