package leetcode;

import java.util.ArrayList;
import java.util.List;

public class QuJian {
    public List<Integer> partitionLabels(String S) {
        // 存放每个字母最后一次在字符串中出现的位置
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i) {
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        // preIndex表示上个区间的右端点
        // maxIndex表示当前遍历的字符最后出现位置的最大值
        int preIndex = -1, maxIndex = 0;
        for (int i = 0; i < S.length(); i++) {
            int index = last[S.charAt(i) - 'a'];
            // int index = S.lastIndexOf(S.charAt(i));
            // 更新区间的右端点, 向右延展
            if (index > maxIndex) {
                maxIndex = index;
            }
            // 如果当前位置i等于当前所遍历的字符最后出现位置的最大值
            // 说明maxIndex即为区间的右端点
            if (i == maxIndex) {
                // 添加区间的长度
                res.add(maxIndex - preIndex);
                // 保存当前右端点
                preIndex = maxIndex;
            }
        }
        return res;
    }

}
