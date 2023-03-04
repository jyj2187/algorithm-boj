package com.algorithm.Programmers;

import java.util.*;

/*
    완주하지 못한 선수
    Map에 각 이름당 사람 수를 저장하고
    완주한 선수들 만큼 사람수를 뺀다
    값이 0이 아닌 Key를 찾는다 = 사람이 한명 안들어왔기 때문
 */
public class PRO42576 {
    private static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> checkMap = new HashMap<>();

        for (String player : participant) {
            if (checkMap.containsKey(player)) {
                checkMap.put(player, checkMap.get(player) + 1);
                continue;
            }
            checkMap.put(player, 1);
        }

        for (String player : completion) {
            checkMap.put(player, checkMap.get(player) - 1);
        }

        for (String player : participant) {
            if (checkMap.get(player) != 0) {
                answer = player;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }
}
