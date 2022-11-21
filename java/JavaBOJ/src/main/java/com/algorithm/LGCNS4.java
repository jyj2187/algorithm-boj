package com.algorithm;

import java.util.Arrays;

// 트리가 주어진다.
// 트리의 루트가 바뀔 때마다 간선이 바뀌는 횟수를 기록

public class LGCNS4 {
    public static void main(String[] args) {
//        int[][] edges = new int[][]{{1, 3}, {1, 2}, {2, 4}, {2, 5}};
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 4}};
//        int[] roots = new int[]{2, 3};
        int[] roots = new int[]{3,4,1,2};
        // result [1, 2, 0, 0];
        // result [3, 2, 2];
    }
}
