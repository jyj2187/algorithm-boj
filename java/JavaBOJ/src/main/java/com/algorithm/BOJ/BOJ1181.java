package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 단어 정렬
 */
public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        List<String> result = new ArrayList<>();

        while (T-- > 0) {
            String input = br.readLine();
            if (result.contains(input)) {
                continue;
            }
            result.add(input);
        }

        // sort 안에 직접 Comparator를 구현해준다.
        // 람다식을 써도 된다.
//        result.sort((s1, s2) -> {
//            if (s1.length() == s2.length()) {
//                return s1.compareTo(s2);
//            } else {
//                return Integer.compare(s1.length(), s2.length());
//            }
//        });

        result.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return Integer.compare(s1.length(), s2.length());
                }
            }
        });

        for (String s : result) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
