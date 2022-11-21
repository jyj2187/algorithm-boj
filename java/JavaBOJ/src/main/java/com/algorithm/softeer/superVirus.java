package com.algorithm.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 분할 정복 문제
 */

public class superVirus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int K = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);
        long N = Long.parseLong(input[2]);

        long result = (long) (K * Math.pow(P, (N * 10)));
        System.out.println(result%1000000007);
    }
}
