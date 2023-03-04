package com.algorithm.BOJ.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        int[] numbers = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            numbers[i] = numbers[i - 1] + Integer.parseInt(input[i-1]);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            System.out.println(numbers[end] - numbers[start - 1]);
        }

    }
}
