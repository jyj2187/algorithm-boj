package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소수 찾기
 */
public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int count = 0;


        for(int i = 0; i < T; i++) {
            int num = Integer.parseInt(input[i]);
            boolean isPrime = true;
            if (num <= 1) {
                continue;
            }
            if (num == 2 ) {
                count++;
                continue;
            }
            for (int j = 2; j < num; j++) {
//            for(int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}
