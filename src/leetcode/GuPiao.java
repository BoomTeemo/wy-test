package leetcode;

import java.util.Scanner;

public class GuPiao {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] question = {7,1,5,3,6,4};
        GuPiao guPiao = new GuPiao();
        int solution = guPiao.maxProfit(question);
        System.out.println(solution);
    }
}
