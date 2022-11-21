package com.algorithm.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 구현 문제 난이도 3
 * 문제 요구 사항이 이해하기 쉬워서 어렵지 않게 풀 수 있었다.
 * 출력 형식에 주의하자. String.format을 이용하면 소수의 출력 형식을 지정할 수 있다.
 */

public class averageScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");

        // 왜 받음?
        int studentNum = Integer.parseInt(input[0]);
        int T = Integer.parseInt(input[1]);

        String[] scoresString = br.readLine().split(" ");
        List<Integer> scoresList = new ArrayList<>();
        for (String s : scoresString) {
            scoresList.add(Integer.parseInt(s));
        }

        while(T-- > 0) {
            input = br.readLine().split(" ");
            int startIndex = Integer.parseInt(input[0]) - 1;
            int endIndex = Integer.parseInt(input[1]);
            int scoreSum = 0;
            for (int i = startIndex; i<endIndex; i++) {
                scoreSum += scoresList.get(i);
            }

            float averageScore = (float) scoreSum / (endIndex - startIndex);
            sb.append(String.format("%.2f",averageScore)).append("\n");
        }
        System.out.println(sb);
    }
}
