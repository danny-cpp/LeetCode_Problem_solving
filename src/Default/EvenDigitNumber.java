package Default;

public class EvenDigitNumber {
    private static int countDigit(int num) {
        int digit = 1;
        while (num >= 10) {
            num /= 10;
            digit++;
        }
        return digit;
    }

    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (countDigit(num) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        EvenDigitNumber e = new EvenDigitNumber();
        System.out.println(countDigit(1456));

        int[] arr = {555,901,482,1771};
        System.out.println(e.findNumbers(arr));
    }
}
