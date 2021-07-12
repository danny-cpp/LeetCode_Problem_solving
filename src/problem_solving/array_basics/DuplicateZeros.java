package problem_solving.array_basics;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                duplicateZeroAt(arr, i);
                i++;
            }
        }
    }

    private static void duplicateZeroAt(int[] arr, int position) {
        if (arr.length - 1 - position >= 0)
            System.arraycopy(arr, position, arr, position + 1, arr.length - 1 - position);
        arr[position] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        DuplicateZeros d = new DuplicateZeros();
        d.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
