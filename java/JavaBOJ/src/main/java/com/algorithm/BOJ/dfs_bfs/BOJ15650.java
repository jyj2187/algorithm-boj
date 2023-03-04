package com.algorithm.BOJ.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    N과 M (2)
 */
public class BOJ15650 {
    static boolean[] visited;
    static int[] arr;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);
        visited = new boolean[N];
        arr = new int[M];

        dfs(0, 1);

        System.out.println(sb);
    }

    private static void dfs(int start, int at) {
        if (start == M) {
            for (int v : arr) {
                sb.append(v).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i <= N; i++) {
                arr[start] = i;
                dfs(start + 1, i + 1);
        }
    }
}
