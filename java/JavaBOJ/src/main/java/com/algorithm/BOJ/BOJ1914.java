package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 하노이의 탑
 */
public class BOJ1914 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger result = new BigInteger("1");
        int N = Integer.parseInt(br.readLine());
        if (N <= 20) {
            sb.append((int)(Math.pow(2, N) - 1)).append("\n");
            hanoi(N, 1, 2, 3);
        } else {
            for(int i = 0; i < N; i++){
                result = result.multiply(new BigInteger("2"));
            }
            result = result.subtract(new BigInteger("1"));
            sb.append(result);
        }
        System.out.println(sb);
    }

    static void hanoi(int N, int from, int temp, int to) {
        if (N == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        hanoi(N - 1, from, to, temp);
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(N -1, temp, from, to);
    }
}
