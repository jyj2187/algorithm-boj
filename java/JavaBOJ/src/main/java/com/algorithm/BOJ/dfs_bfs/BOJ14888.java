package com.algorithm.BOJ.dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    연산자 끼워넣기
    백트래킹
 */
public class BOJ14888 {
    static boolean[] visited;
    static int N;
    static int[] A;
    static int[] operator = new int[4];
    static int max = -1000000000;
    static int min = 1000000000;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        for (int i = 0; i < operator.length; i++) {
            operator[i] = Integer.parseInt(input[i]);
        }

        dfs(1, A[0]);

        sb.append(max).append("\n").append(min);
        System.out.println(sb);
    }

    private static void dfs(int start, int result) {
        if (start == N) {
            max = Math.max(result, max);
            min = Math.min(result, min);
        } else {
            if (operator[0] > 0) {
                operator[0] -= 1;
                dfs(start + 1, result + A[start]);
                operator[0] += 1;
            }
            if (operator[1] > 0) {
                operator[1] -= 1;
                dfs(start + 1, result - A[start]);
                operator[1] += 1;
            }
            if (operator[2] > 0) {
                operator[2] -= 1;
                dfs(start + 1, result * A[start]);
                operator[2] += 1;
            }
            if (operator[3] > 0) {
                operator[3] -= 1;
                dfs(start + 1, result / A[start]);
                operator[3] += 1;
            }
        }
    }
}
