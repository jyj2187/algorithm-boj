package com.algorithm.Programmers;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int price = 0;
        int answer = 0;
        for (int i = 0; i < d.length; i++) {
            price += d[i];
            if(price > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        예산 sol = new 예산();
        int[] d1 = {1, 3, 2, 5, 4};
        int budget1 = 9;
        System.out.println(sol.solution(d1, budget1));

        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;
        System.out.println(sol.solution(d2, budget2));
    }
}
