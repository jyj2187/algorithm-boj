package com.algorithm.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRO42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        System.out.println(answer.length);

        for (int i = 0; i < commands.length; i++) {
            int from = commands[i][0] - 1;
            int to = commands[i][1];
            int result = commands[i][2] - 1;
            int[] range = Arrays.copyOfRange(array, from, to);
            System.out.println(range.length);
            Arrays.sort(range);
            answer[i] = range[result];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }
}
