package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 접미사 배열 + 정렬
 */

public class BOJ11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        List<String> result = new ArrayList<>();
        for (int i = 0; i<input.length(); i++) {
            result.add(input.substring(i));
        }
        result = result.stream().sorted().collect(Collectors.toList());

        for(String s: result) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
