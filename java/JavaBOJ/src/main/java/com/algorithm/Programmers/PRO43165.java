package com.algorithm.Programmers;

/*
    타겟 넘버
    int[] numbers는 각 -와 +로 표현할 수 있는 2차원 배열
 */
public class PRO43165 {
    static int count = 0;

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, target, 0, 0);

        return count;
    }

    private static void dfs(int[] numbers, int target, int start, int sum) {
        if (start == numbers.length) {
            if (sum == target) {
                count++;
            }
        } else {
            dfs(numbers, target, start + 1, sum + numbers[start]);
            dfs(numbers, target, start + 1, sum - numbers[start]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }
}
