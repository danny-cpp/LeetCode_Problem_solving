package problem_solving.dynamic_programming;

public class Fibonacci {
    public long classicApproach(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        else {
            return classicApproach(n - 1) + classicApproach(n - 2);
        }
    }

    public long linearApproach(long n) {
        long first = 0;
        long cache = 0;
        long second = 1;

        for (int i = 1; i < n; i++) {
            cache = first + second;
            first = second;
            second = cache;
        }

        return second;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        // System.out.println(f.classicApproach(50));
        System.out.println(f.linearApproach(50));
    }
}
