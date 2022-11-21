package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ATM
 */
public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        new BOJ11399().solution();
    }

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            list.add(Integer.parseInt(numbers[i]));
        }

        Collections.sort(list);
        int waiting = 0;
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            waiting += list.get(i);
            result += waiting;
        }

        System.out.println(result);
    }
}
