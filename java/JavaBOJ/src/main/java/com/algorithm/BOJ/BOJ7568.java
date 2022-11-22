package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 덩치
 */
public class BOJ7568 {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int[][] xy;
    static int count;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        xy = new int[N][2];

        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            xy[i][0] = Integer.parseInt(input[0]);
            xy[i][1] = Integer.parseInt(input[1]);
        }

        // 각 요소에 대한 체크를 해야 하니 모두 탐색한다.
        count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]) {
                    count++;
                }
            }
            sb.append(count).append(" ");
            count = 1;
        }


        System.out.println(sb);
    }
}

