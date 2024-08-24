package org.coding.Practice;

import java.util.Arrays;
import java.util.List;

public class FindFirstInJava {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Leeks", null, "GeeksQuiz", "GeeksforGeeks", "GFG");
        String result = list.stream().filter(it -> it.startsWith("G")).findFirst().orElse(null);
        System.out.println(result);
    }
}
