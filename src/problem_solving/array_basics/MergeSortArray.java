package problem_solving.array_basics;

import java.util.Arrays;

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums2.length == 0) {
            return;
        }
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        MergeSortArray m = new MergeSortArray();
        m.merge(arr1, 3, arr2, 3);

        System.out.println(Arrays.toString(arr1));
    }
}
