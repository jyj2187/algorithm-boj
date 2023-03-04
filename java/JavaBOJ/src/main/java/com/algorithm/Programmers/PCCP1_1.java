package com.algorithm.Programmers;

import java.util.*;

/**
 * PCCP 모의고사 1 - 1
 * 외톨이 알파벳
 * 자료구조 적극 이용
 */
public class PCCP1_1 {
    private static String solution(String input_string) {
        String answer = "";
        Map<Character, Boolean> checkMap = new HashMap<>();
        char[] input_array = input_string.toCharArray();
        Set<Character> duplicateSet = new TreeSet<>();
        char current = ' ';

        // 현재 알파벳이 이전에 나왔는지를 검사한다.
        // 직전에 나온 알파벳과 같으면 검사를 건너뛴다.

        for (char ch : input_array) {
            if (current == ch) {
                continue;
            }
            if (checkMap.containsKey(ch)) {
                duplicateSet.add(ch);
            }
            checkMap.put(ch, true);
            current = ch;
        }

        for (char ch : duplicateSet) {
            answer += ch;
        }

        if (answer == "") {
            return "N";
        }

        return answer;
    }

    public static void main(String[] args) {
        String input_string = "edeaaabbccd";
//        String input_string = "success";
        System.out.println(solution(input_string));
    }
}
