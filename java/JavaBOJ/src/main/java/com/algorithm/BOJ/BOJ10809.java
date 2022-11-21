package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열 안에 알파벳 위치 찾기
 */

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for (int i = 'a'; i <= 'z'; i++) {
            sb.append(input.indexOf(i)).append(" ");
        }
        System.out.println(sb);
    }
}
