package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 평균은 넘겠지
 */
public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            List<Integer> scores = new ArrayList<>();
            for (String s : input) {
                scores.add(Integer.parseInt(s));
            }

            int sumScore = 0;
            for (int i = 1; i < scores.size(); i++) {
                sumScore += scores.get(i);
            }

            float averageScore = (float) sumScore / scores.get(0);

            int averageStudent = 0;
            for (int i = 1; i < scores.size(); i++) {
                if (scores.get(i) > averageScore) {
                    averageStudent++;
                }
            }
            float result = (float) averageStudent / scores.get(0);
            sb.append(String.format("%.3f", result * 100)).append("%").append("\n");
        }
        System.out.println(sb);
    }
}
