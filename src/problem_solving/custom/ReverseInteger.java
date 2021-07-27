package problem_solving.custom;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseInteger {
    public int reverse(int x) {
        int counter = -1;

        Queue<Integer> l = new LinkedList<>();
        while (x != 0) {
            l.add(x % 10);
            x /= 10;
            counter++;
        }

        long res = 0;
        while (!l.isEmpty()) {
            int tmp = l.poll();
            res += ((long)Math.pow(10, counter))*tmp;
            counter--;
        }

        if ((int)res != res) {
            return 0;
        }

        return (int)res;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(123456));
    }
}
