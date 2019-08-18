package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GongGongQianZhui {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String min = strs[0] ;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isEmpty()) {
                return "";
            }
            if (strs[0].charAt(0) != strs[i].charAt(0)) {
                return "";
            }
            if (strs[i].length() <= min.length()) {
                min = strs[i];
            }
        }
        for (int i = 0; i < strs.length; i++) {
            if (min.equals(strs[i])) {
                continue;
            }
            for (int j = min.length()-1; j > 0 ; j--) {
                if (min.charAt(j) != strs[i].charAt(j)) {
                    min = min.substring(0, j);
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        GongGongQianZhui qianzhui = new GongGongQianZhui();
        String []qianZhui={"flower","flow","flight"};
        String solution= (String) qianzhui.longestCommonPrefix(qianZhui);
        System.out.println(solution);
    }
}
