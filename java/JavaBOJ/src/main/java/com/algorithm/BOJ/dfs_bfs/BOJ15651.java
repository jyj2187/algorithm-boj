package com.algorithm.BOJ.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    N 과 M (3)
 */
public class BOJ15651 {
    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);
        arr = new int[M];

        dfs(0);

        System.out.println(sb);
    }

    private static void dfs(int start) {
        if (start ==M) {
            for (int v : arr) {
                sb.append(v).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[start] = i + 1;
            dfs(start + 1);
        }
    }
}
