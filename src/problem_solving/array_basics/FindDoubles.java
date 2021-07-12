package problem_solving.array_basics;

import java.util.HashMap;

public class FindDoubles {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            // System.out.println("itt is: " + num);
            if (num % 2 == 0) {
                int half = num/2;
                if (map.containsKey(2*num) || map.containsKey(half)) {
                    // System.out.println("pair are: " + num + " " + 2*num + " " + half);
                    return true;
                }
                else {
                    map.put(num, 1);
                }
            }
            else if (map.containsKey(2*num)) {
                // System.out.println("pair are: " + num + 2*num);
                return true;
            }
            else {
                map.put(num, 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        FindDoubles f = new FindDoubles();
        System.out.println(f.checkIfExist(arr));
    }
}
