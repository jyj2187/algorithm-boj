package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 카드2
 */
public class BOJ2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            cards.add(i);
        }
        // while true로 설정하면 메모리 초과가 뜬다.
        while (cards.size() > 1) {
            cards.poll();
            cards.add(cards.poll());
        }

        System.out.println(cards.poll());
    }
}
