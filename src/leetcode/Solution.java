package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
//求重复数
//List中contains()的原理：遍历List中的每个元素
// 每个元素与比较对象进行equals()比较
// 只要有一个相同,就返回true
class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> m = new HashSet<>();
        for(int j : A)
            if(m.contains(j))return j;
            else m.add(j);
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int A[] = {5,1,5,2,5,3,5,4};
        int ChongFu = solution.repeatedNTimes(A);
        System.out.println(ChongFu);
    }
}