package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KuoHaoShengCheng {
    public static List<String> generateParenthesis(int n) {
        List<String> al = new ArrayList<>();
        add(al, "", 0, 0, n);
        return al;
    }

    public static void add(List<String> al, String s, int count1, int count2, int n) {
        if (count1 < n && count1 > count2) {
            String ss = new String(s);
            add(al, ss += "(", count1 + 1, count2, n);
            add(al, s += ")", count1, count2 + 1, n);
        } else if (count1 < n && count1 == count2) {
            add(al, s += "(", count1 + 1, count2, n);
        } else if (count1 == n) {
            for (int i = 0; i < n - count2; i++) {
                s += ")";
            }
            al.add(s);
        }
    }

}
