package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열 안에 알파벳 개수
 */

public class BOJ10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for (int i = 'a'; i <= 'z'; i++) {
            char ch = (char) i;
//            sb.append(input.length() - input.replace(String.valueOf((char) i), "").length()).append(" ");
            sb.append(input.chars().filter(c -> c == ch).count()).append(" ");
        }
        System.out.println(sb);
    }
}
