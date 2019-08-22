package leetcode;

import java.util.Scanner;

public class LastWordLength {
        public int lengthOfLastWord(String s) {
            int end = s.length() - 1;
            while(end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if(end < 0) {
                return 0;
            }
            int start = end;
            while(start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            return end - start;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        LastWordLength length = new LastWordLength();
        int solution=length.lengthOfLastWord(question);
        System.out.println(solution);
    }

}
