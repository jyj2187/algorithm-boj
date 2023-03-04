package com.algorithm.Programmers;

/**
 * PCCP 모의고사 1 - 2
 * 체육대회
 * DFS 탐색 백트래킹 문제
 */
public class PCCP1_2 {
    static boolean[] visited;
    static int depth;
    static int total = 0;

    public static int solution(int[][] ability) {
        visited = new boolean[ability.length];
        depth = ability[0].length;

        dfs(ability, 0, 0);

        return total;
    }

    private static void dfs(int[][] ability, int start, int sum) {
        if(start == depth) {
            total = Math.max(total, sum);
            return;
        }

        for (int i = 0; i < ability.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(ability, start + 1, sum+ability[i][start]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] ability = {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}};
        System.out.println(solution(ability));
    }
}
