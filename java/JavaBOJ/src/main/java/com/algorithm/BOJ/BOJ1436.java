package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 영화감독 숌
 */
public class BOJ1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;
        if (N > 1) {
            while (count != N) {
                ++num;
                if (String.valueOf(num).contains("666")) {
                    ++count;
                }
            }
            System.out.println(num);
        } else {
            System.out.println("666");
        }
    }
}
