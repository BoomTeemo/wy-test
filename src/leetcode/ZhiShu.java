package leetcode;

import java.util.Scanner;

public class ZhiShu {
    public int countPrimes(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = 1;
        }
        for (int i = 2; i < n; i++) {
            //如果当前数为质数
            if (nums[i] == 1) {
                //将对应数的倍数变为0
                for (int j = 2; i * j < n; j++) {
                    nums[i * j] = 0;
                }
            }
        }
        //遍历数组，统计值为1的元素个数
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (nums[i] == 1)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        ZhiShu happy = new ZhiShu();
        int solution = happy.countPrimes(question);
        System.out.println(solution);
    }
}


