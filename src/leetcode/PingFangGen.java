package leetcode;

import java.util.Scanner;

public class PingFangGen {
    public int mySqrt(int x) {
        if (x == 1 || x == 0) {
            return x;
        }
        int start = 1;
        int end = x / 2 + 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //防止越界
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            }
            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        PingFangGen pingFangGen = new PingFangGen();
        int solution = pingFangGen.mySqrt(question);
        System.out.println(solution);
    }
}
