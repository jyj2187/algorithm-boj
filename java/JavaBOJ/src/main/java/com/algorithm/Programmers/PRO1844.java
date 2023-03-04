package com.algorithm.Programmers;

/*
    게임 맵 최단거리
    bfs
 */
public class PRO1844 {
    static int answer = 0;

    public static int solution(int[][] maps) {

        return answer;
    }

    public static void main(String[] args) {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};
        System.out.println(solution(maps));
    }
}
