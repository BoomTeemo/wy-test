package leetcode;

public class JiaYi {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int [] question = {1,2,3};
        JiaYi jiaYi = new JiaYi();
        int [] result= jiaYi.plusOne(question);
        System.out.println(result);
    }
}
