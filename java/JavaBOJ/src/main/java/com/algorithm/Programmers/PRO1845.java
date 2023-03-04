package com.algorithm.Programmers;

import java.util.HashSet;
import java.util.Set;

/*
    폰켓몬
    정확히는 중복을 제거하는 조합 문제
    Set으로 중복을 제거해주면 된다.
    대신 조건이 전체 수의 절반이라고 했으므로 굉장히 간단한 로직
    왠지 어디서 봤던 문제같은데..

 */
public class PRO1845 {
    private static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        return Math.min(set.size(), nums.length / 2);

    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }
}
