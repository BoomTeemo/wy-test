package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ChongSuJuZhen {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length) {
            return nums;
        }
        int count = 0;
        Queue< Integer > queue = new LinkedList< >();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ChongSuJuZhen chongSuJuZhen = new ChongSuJuZhen();
        int a[][] = {{1,2},{3,4}};
        int b=1;
        int c=4;
        chongSuJuZhen.matrixReshape(a,b,c);
    }
}
