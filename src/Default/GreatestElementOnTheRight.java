package Default;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GreatestElementOnTheRight {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            arr[len-1] = -1;
            return arr;
        }

        int tmp_max = arr[len-1];
        int[] res = new int[len];

        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] > tmp_max) {
                tmp_max = arr[i];
            }
            res[i-1] = tmp_max;
        }

        res[len-1] = -1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        GreatestElementOnTheRight g = new GreatestElementOnTheRight();
        System.out.println(Arrays.toString(g.replaceElements(arr)));


        // Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        // for (int i = 1; i < arr.length; i++) {
        //     q.add(arr[i]);
        // }
        //
        // int[] res = new int[arr.length];
        // int j = 0;
        // while (!q.isEmpty()) {
        //     res[j] = q.peek();
        //     q.remove(arr[j+1]);
        //     j++;
        // }
        //
        // System.out.println(Arrays.toString(res));
    }
}
