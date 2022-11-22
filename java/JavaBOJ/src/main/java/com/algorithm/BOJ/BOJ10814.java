package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 나이순 정렬
 * 삽입정렬은 너무 느리다
 * 병합, 힙, 라이브러리의 정렬함수를 이용하라는 조언
 */
public class BOJ10814 {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;

    // 그냥 문자열로 둘 다 받아도 됐었다!
    static int[][] ages;
    static String[] names;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        ages = new int[N][2];
        names = new String[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            ages[i][0] = Integer.parseInt(input[0]);
            ages[i][1] = i;
            names[i] = input[1];
        }

        Arrays.sort(ages, ((o1, o2) -> o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]));

        for (int i = 0; i < N; i++) {
            sb.append(ages[i][0]).append(" ").append(names[ages[i][1]]).append("\n");
        }
        System.out.println(sb);
    }
}
