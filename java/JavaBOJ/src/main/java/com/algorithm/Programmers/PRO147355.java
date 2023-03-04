package com.algorithm.Programmers;

/**
 * lv.1
 * 크기가 작은 부분 문자열
 */
public class PRO147355 {
    private int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        for (int i = 0; i < tLength - pLength + 1; i++) {
            long splitNum = Long.parseLong(t.substring(i, i + pLength));
            if (splitNum > Long.parseLong(p)) {
                continue;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        PRO147355 sol = new PRO147355();
        String t = "10203";
        String p = "15";
        System.out.println(sol.solution(t, p));
    }
}
