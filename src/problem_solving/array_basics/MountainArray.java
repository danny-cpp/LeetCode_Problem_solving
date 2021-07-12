package problem_solving.array_basics;

public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        if (arr[0] >= arr[1]) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] == arr[i]) {
                return false;
            }
            else if (arr[i+1] < arr[i]) {
                for (; i < arr.length - 1; i++) {
                    if (arr[i+1] >= arr[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,5};
        MountainArray m = new MountainArray();
        System.out.println(m.validMountainArray(arr));
    }
}
