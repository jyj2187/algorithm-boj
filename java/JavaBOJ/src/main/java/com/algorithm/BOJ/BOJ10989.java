package com.algorithm.BOJ;

import java.io.*;

/**
 * 수 정렬하기 메모리 제한
 * 카운팅 정렬
 */
public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        // 10000보다 같거나 작은 수 => 10000 크기의 배열 생성 후
        // 각 수의 갯수를 저장한다.
        int[] arr = new int[10001];
        for(int i = 0; i < T; i++) {
            ++arr[Integer.parseInt(br.readLine())];
        }

        // 개수가 0인 인덱스만 빼고 해당 숫자만큼 인덱스를 출력.
        for (int i = 1; i < 10000; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    bw.write(i + "\n");
                }
            }
        }

        bw.flush();
    }
}
