package com.algorithm.BOJ.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    신기한 소수 찾기
    왼쪽부터 1 자리 2자리 3자리 4자리... N 자리의 수가 소수인 수 찾기
    ex) 자릿수 = 4
        2부터 시작하여 23, 233, 2333은 모두 소수이므로 출력

    소수 판단 isPrime
        - 에라토스테네스의 체 이용
        - 2로 나누어서 (절반 이후로는 약수가 없으므로) 약수가 존재하는지 체크

    탈출 조건 : 자릿수가 N이 되면 소수인지 판단하여 출력

    자릿수가 하나씩 늘어날때마다 소수인지 판단
    다음 자릿수가 짝수이면 제외
    소수가 맞을 때만 재귀를 돌린다

    한 자리에 들어갈 수 있는 소수의 종류는 2, 3, 5, 7이므로 시작은 2, 3, 5, 7 각각의 dfs로 시작한다.
 */

public class BOJ2023 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    private static void DFS(int number, int digit) {
        if (digit == N) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (isPrime(number * 10 + i)) {
                DFS(number * 10 + i, digit + 1);
            }
        }
    }

    private static boolean isPrime(int number) {
        for(int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
