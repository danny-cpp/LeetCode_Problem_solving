package contest.ct1;

import java.util.Arrays;

public class XORArray {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];
        int i = 0;

        for (int[] query : queries) {
            int tmp = arr[query[0]];
            if (query[0] == query[1]) {
                res[i] = arr[query[0]];
                i++;
                continue;
            }

            for (int j = query[0]; j < query[1]; j++) {
                tmp ^= arr[j + 1];
            }

            res[i] = tmp;
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,8,2,10};
        int[][] queries = {{2,3},{1,3},{0,0},{0,3}};

        XORArray x = new XORArray();
        System.out.println(Arrays.toString(x.xorQueries(arr, queries)));
    }
}
