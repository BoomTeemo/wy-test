package leetcode;

public class ZhongHuaWenTi {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
                    && (i - 1 == -1 || flowerbed[i - 1] == 0)
                    && (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)) {
                n--;
                flowerbed[i] = 1;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int []question1 = {1,0,0,0,1};
        int question2 = 1;
        boolean result = ZhongHuaWenTi.canPlaceFlowers(question1,question2);
        System.out.println(result);
    }
}
