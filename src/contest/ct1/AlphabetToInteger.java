package contest.ct1;

import java.util.Stack;

public class AlphabetToInteger {
    public String freqAlphabets(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int tmp = Integer.parseInt(s.substring(i-2, i));
                st.push((char) (tmp + 'a' - 1));
                i -= 2;
            }
            else {
                int tmp2 = Integer.parseInt(String.valueOf(s.charAt(i)));
                st.push((char) (tmp2 + 'a' - 1));
            }
        }

        String res = "";
        while (!st.empty()) {
            res += st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        AlphabetToInteger a = new AlphabetToInteger();
        System.out.println(a.freqAlphabets(s));
    }
}
