package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 차이를 최대로
 */
public class BOJ10819 {
    boolean[] v;
    int[] numArr;
    int answer = 0;
    int N;

    public static void main(String[] args) throws IOException {
        new BOJ10819().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        numArr = new int[N];
        v = new boolean[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(input[i]);
        }

        dfs(0, 0, 0);
        System.out.println(answer);
    }
    // dfs를 생성하는 방법에 대해서 고민해보자.
    // 재귀와 스택을 이용해서 구현할 수 있다.
    // 기본적으로 깊이(count)를 주고 나머지 파라미터에 비교할 값을 넣어준다.
    // 이 문제에서는 bf에 A[N-2]를 주고 sum에서 삼항연산자를 통해 A[N-2] - A[N-1] 연산을 한다.
    private void dfs(int count, int bf, int sum) {
        if (count == N) {
            answer = Math.max(answer, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (v[i]) {
                continue;
            }
            v[i] = true;
            dfs(count + 1, numArr[i], count == 0 ? 0 : sum + Math.abs(bf - numArr[i]));
            v[i] = false;
        }
    }
}
