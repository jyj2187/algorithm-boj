package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소수 구하기
 */

public class BOJ1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        boolean[] prime = new boolean[N + 1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < N + 1; j = j + i) {
                prime[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
