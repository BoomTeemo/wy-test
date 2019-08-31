package leetcode;

import java.util.Scanner;

public class Ugly {
    public boolean isUgly(int num) {
        if (num < 0) {
            return false;
        }
        int[] baseArr = new int[]{1, 2, 3, 5};
        int i = 3;
        while (i > 0) {
            if (num % baseArr[i] != 0) {
                i--;
                continue;
            }
            num /= baseArr[i];
        }
        if (num > 5) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        Ugly ugly = new Ugly();
        boolean result = ugly.isUgly(question);
        System.out.println(result);
    }
}

