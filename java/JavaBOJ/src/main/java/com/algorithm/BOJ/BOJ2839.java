package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 설탕배달
 */
public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        new BOJ2839().solution();
    }

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = 0;
        while (total >= 0) {
            if (total % 5 == 0) {
                count += total / 5;
                System.out.println(count);
                break;
            }
            total -= 3;
            count++;
        }

        if (total < 0) {
            System.out.println(-1);
        }
    }
}
