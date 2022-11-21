package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 좌표 정렬하기 1, 2
 * 11651문제 포함
 */
public class BOJ11650 {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int[][] xy;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        xy = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            xy[i][0] = Integer.parseInt(input[0]);
            xy[i][1] = Integer.parseInt(input[1]);
        }

        // 직접 구현할 수 있지 않을까?
        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 11650, 11651 문제는 이 부분의 순서만 바꾸어주면 된다.
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(xy[i][0]).append(" ").append(xy[i][1]).append("\n");
        }
        System.out.println(sb);
    }

//    static void sort() {
//        for (int i = 0; i < xy.length - 1; i++) {
//            for (int j = i + 1; j < xy.length; j++) {
//                if (xy[i][0] != xy[j][0]) {
//                    if (xy[i][0] > xy[j][0]) {
//                        swap(i, j);
//                    }
//                }
//                if (xy[i][0] == xy[j][0]) {
//                    if (xy[i][1] > xy[j][1]) {
//                        swap(i, j);
//                    }
//                }
//            }
//        }
//    }
//
//    static void swap(int i, int j) {
//        int tempX = xy[i][0];
//        int tempY = xy[i][1];
//        xy[i][0] = xy[j][0];
//        xy[i][1] = xy[j][1];
//        xy[j][0] = tempX;
//        xy[j][1] = tempY;
//    }
}
