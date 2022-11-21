package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * OX 퀴즈
 */
public class BOJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] input = br.readLine().split("");
            int result = 0;
            int chain = 0;
            for (String s : input) {
                if (s.equals("O")) {
                    chain++;
                    result += chain;
                }
                if (s.equals("X")) {
                    chain = 0;
                }
            }

            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
