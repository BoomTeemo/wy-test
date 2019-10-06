package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZuHeZongHe {
    //1ms 99%
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(1, k, n, new ArrayList<Integer>());
        return res;
    }

    private void backTrack(int start, int k, int n, ArrayList<Integer> list) {
        if (k == 0) {
            if (n == 0) {
                res.add(new ArrayList<>(list));
            } else {
                return;
            }
        }
        for (int i = start; i <= 9; i++) {
            if (i > n) {
                return;
            } else {
                list.add(i);
                backTrack(i + 1, k - 1, n - i, list);
                list.remove(list.size() - 1);
            }
        }
    }
}