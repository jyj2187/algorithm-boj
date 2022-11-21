package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N-Queen
 */
public class BOJ9663 {
    private static int[] rows;
    private static int N;
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        rows = new int[N];
        nQueens(0);
        System.out.println(count);
    }

    static void nQueens(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            rows[depth] = i;
            if (isValid(depth)) {
                nQueens(depth + 1);
            }
        }
    }

    private static boolean isValid(int col) {
        for (int i = 0; i < col; i++) {
            int diff = Math.abs(rows[col] - rows[i]);
            if (diff == 0 || diff == Math.abs(col - i)) {
                return false;
            }
        }
        return true;
    }

//    static List<List<Integer>> nQueens(int n) {
//        List<List<Integer>> result = new ArrayList<>();
//        solvedNQueens(n, 0, new ArrayList<Integer>(), result);
//        return result;
//    }
//
//    private static void solvedNQueens(int n, int row, ArrayList<Integer> colPlacement, List<List<Integer>> result) {
//        if (row == n) {
//            // 열의 수와 칸의 수가 맞으면 결과에 추가
//            result.add(new ArrayList<>(colPlacement));
//        } else {
//            for(int col = 0; col < n; col++) {
//                // 행에 숫자를 추가
//                colPlacement.add(col);
//                // 해당 행의 배치가 허용되는지 판단
//                if (isValid(colPlacement)) {
//                    // 허용되면 다음 열로 진행
//                    solvedNQueens(n, row + 1, colPlacement, result);
//                }
//                colPlacement.remove(colPlacement.size() - 1);
//            }
//        }
//    }
//
//    private static boolean isValid(ArrayList<Integer> colPlacement) {
//        // 현재 검사할 행의 번호
//        int rowID = colPlacement.size() - 1;
//        for (int i = 0; i < rowID; i++) {
//            // 행번호와 같거나 한칸 차이 나는지 검사 (여왕의 이동경로에 있는지 검사)
//            int diff = Math.abs(colPlacement.get(i) - colPlacement.get(rowID));
//            if (diff == 0 || diff == rowID - i) {
//                // 있으면 거짓을 반환
//                return false;
//            }
//        }
//        // 없으면 진실을 반환
//        return true;
//    }
}
