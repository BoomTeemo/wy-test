package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BigramFenCi {
    public String[] findOcurrences(String text, String first, String second) {
        String[] letter = text.split(" ");

        List<String> list = new ArrayList<>();
        for(int i=0; i<letter.length-2; i++){
            if(letter[i].equals(first) && letter[i+1].equals(second)){
                list.add(letter[i+2]);
            }
        }
        String[] answer = new String[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        return answer;
    }

    public static void main(String[] args) {
        String question1 =  "alice is a good girl she is a good student";
        String question2 = "a";
        String question3 = "good";
        BigramFenCi bigramFenCi = new BigramFenCi();
        String[] result = bigramFenCi.findOcurrences(question1,question2,question3);
        System.out.println(result);
    }

}
