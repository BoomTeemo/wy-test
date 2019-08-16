package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roma {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int pre = 1001;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            Integer mapresult = map.get(c);
            result += mapresult;
            if (mapresult > pre) {
                result = result - (2 * pre);
            }
            pre = mapresult;
        }
        return result;
        }

    public static void main(String[] args) {
        Roma roma = new Roma();
        Scanner scanner = new Scanner(System.in);
        String Roma=scanner.nextLine();
        int solution=roma.romanToInt(Roma);
        System.out.println(solution);
    }
}
