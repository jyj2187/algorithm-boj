package com.algorithm.Programmers;

import java.util.HashMap;
import java.util.Map;

/*
    위장

    사실상 종류에 따른 가짓수를 구하는 문제
 */
public class PRO42578 {
    private static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesMap = new HashMap<>();

        for (String[] c : clothes) {
            String type = c[1];
            if (clothesMap.containsKey(type)) {
                clothesMap.put(type, clothesMap.get(type) + 1);
                continue;
            }
            clothesMap.put(type, 1);
        }

        for (int count : clothesMap.values()) {
            // 해당 종류의 옷을 입지 않는 경우가 있으니 1을 더해준다.
            answer *= (count + 1);
        }

        // 아무것도 입지 않는 경우를 제외한다.
        return answer - 1;
    }
    public static void main(String[] args) {

    }
}
