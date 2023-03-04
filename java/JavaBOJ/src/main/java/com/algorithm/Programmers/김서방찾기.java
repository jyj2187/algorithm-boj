package com.algorithm.Programmers;

public class 김서방찾기 {
    public String solution(String[] seoul) {
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }

        return "김서방은 " + index + "에 있다";
    }

    public static void main(String[] args) {
        김서방찾기 sol = new 김서방찾기();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(sol.solution(seoul));
    }
}
