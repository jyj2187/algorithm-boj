package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * 요세푸스 문제
 */

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder("<");
        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        for(int i = 1; i < N + 1; i++) {
            list.add(i);
        }

        while (list.size() > 0) {
            for (int i = 0; i < K - 1; i++) {
                list.add(list.remove());
            }
            sb.append(list.remove()).append(",").append(" ");
        }
        sb.delete(sb.lastIndexOf(","), sb.length()).append(">");
        System.out.println(sb);
    }
}