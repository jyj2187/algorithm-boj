package com.algorithm.Programmers;

import java.util.Arrays;

/**
 * PCCP 모의고사 1_4
 */
public class PCCP1_4 {
    // int[][] program = {우선순위, 호출 시간, 실행 시간}
    private static long[] solution(int[][] program) {
        long[] answer = new long[10];
        /*
            우선순위는 answer 배열의 인덱스.

            실행시간이 먼저
            우선순위

            전체 실행시간 = 각 실행시간의 합.

            대기시간 = 이전까지의 프로세스 실행시간 - 호출시간
            2번 프로그램의 대기시간은 1번 프로그램 실행시간 10 - 2번 프로그램 호출 시간 5 = 5
            3번 프로그램의 대기시간은 2번 프로그램 15 - 3번 프로그램 호출시간 5 = 10
            4번 프로그램의 대기시간은 3번까지 실행시간 18 - 4번 호출 시간 12 = 6

            long[우선순위] += 대기시간;

            long[0] = sum(p[2]);
         */


        return answer;
    }

    public static void main(String[] args) {
//        int[][] program = {{2, 0, 10}, {1, 5, 5}, {3, 5, 3}, {3, 12, 2}};
        int[][] program = {{3, 6, 4}, {4, 2, 5}, {1, 0, 5}, {5, 0, 5}};
        System.out.println(Arrays.toString(solution(program)));
    }
}
