package com.algorithm.Programmers;

import java.util.Arrays;
import java.util.Stack;

/**
 * PCCP 모의고사 1 - 3
 * 유전법칙
 *
 * 답 배열 초기화
 * RR 밑으로는 전부 RR
 * rr 밑으로는 전부 rr
 * Rr 밑으로는 2세대의 반복이다.
 *
 * 즉 4가지 형질이 반복되니,
 * N세대의 자식을 알기 위해선
 * 자식의 순서 P를 4로 나누어 나머지를 구해
 * N-1 세대의 부모가 누군지 알아내는 것이다.
 *
 * 1세대의 경우는 Rr 고정
 * 2세대의 경우는 RR, Rr, Rr, rr 고정이다.
 * 3세대부터는 P를 4로 나누어 나머지를 구하고 Stack에 넣는다.
 * 나머지가 0이면 RR이다.
 * 나머지가 1이나 2면 Rr이다.
 * 나머지가 3이면 rr이다.
 *
 * 스택에 나머지를 넣어서 부모의 순서를 알아낸다.
 * 2세대부터 검사한다.
 * 나머지를 통해 알아낸 부모 세대에 RR이나 rr이 있다면
 * 그 밑 세대 자식들도 똑같이 RR이거나 rr이 되니 break를 해도된다.
 * 하지만, Rr이라면 스택이 비워질때까지(마지막 세대까지) 검사를 한다.
 *
 * 예컨대 나머지를 통해 각 세대의 부모를 알아내는 것.
 * 검사가 끝나면 index를 꼭 더해주자.
 *
 */
public class PCCP1_3 {
    private static String[] solution(int[][] queries) {
        String[] answer = new String[queries.length];
        String[] character = {"RR", "Rr", "Rr", "rr"};

        int index = 0;
        for (int[] query : queries) {
            int level = query[0];
            // 0부터 시작
            int count = query[1] - 1;

            Stack<Integer> stack = new Stack<>();

            // 1세대인 경우 Rr
            if (level == 1) {
                answer[index] = "Rr";
                index++;
                continue;
            }

            // 2세대인 경우 RR, Rr, Rr, rr의 count번째를 반환
            if (level == 2) {
                answer[index] = character[count];
                index++;
                continue;
            }

            // 3세대부터 판단하기
            while (level != 1) {
                int remain = count % 4;
                count /= 4;
                level--;
                stack.push(remain);
            }

            while (!stack.isEmpty()) {
                String current = character[stack.pop()];
                System.out.println(current);
                if (current.equals("RR")) {
                    answer[index] = "RR";
                    break;
                }
                if (current.equals("rr")) {
                    answer[index] = "rr";
                    break;
                }

                answer[index] = current;
            }

            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] queries = {{3, 1}, {2, 3}, {3, 9}};
        System.out.println(Arrays.toString(solution(queries)));
    }
}
