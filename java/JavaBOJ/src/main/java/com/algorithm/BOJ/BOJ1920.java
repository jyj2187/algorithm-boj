package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 수 찾기
 */
public class BOJ1920 {
    static BufferedReader br;
    static StringBuilder sb;
    static int N, M;
    static int[] numbers, wanted;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);

        M = Integer.parseInt(br.readLine());
        wanted = new int[M];
        input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            wanted[i] = Integer.parseInt(input[i]);
        }

        // List로 contains 체크를 하면 되지만 재미 없잖아?
        for (Integer i : wanted) {
            sb.append(search(i, 0, numbers.length - 1)).append("\n");
        }
        System.out.println(sb);
    }

    static int search(int key, int low, int high) {
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if(key == numbers[mid]) {
                return 1;
            } else if(key < numbers[mid]) {
                // 찾는 값이 중간 값보다 작으면 탐색 범위에서 중간 값 이상을 제외
                high = mid - 1;
            } else {
                // 찾는 값이 중간 값보다 크면 탐색 범위에서 중간 값 이하를 제외
                low = mid + 1;
            }
        }
        
        // 반복문이 끝났음에도 탐색이 되지 않았다면 실패
        return 0;
    }
}
