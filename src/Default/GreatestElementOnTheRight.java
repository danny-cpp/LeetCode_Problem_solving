package Default;

import java.util.Arrays;

public class GreatestElementOnTheRight {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            int tmp_max = arr[j];
            for (; j < arr.length; j++) {
                tmp_max = Math.max(tmp_max, arr[j]);
            }
            arr[i] = tmp_max;
        }

        arr[arr.length-1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        GreatestElementOnTheRight g = new GreatestElementOnTheRight();
        System.out.println(Arrays.toString(g.replaceElements(arr)));
    }
}
