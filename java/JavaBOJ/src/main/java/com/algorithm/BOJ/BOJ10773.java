package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 제로
 */
public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while (T-- > 0) {
            int input = Integer.parseInt(br.readLine());
            if (input != 0) {
                stack.push(input);
                continue;
            }
            stack.pop();
        }

        int result = 0;
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        System.out.println(result);
    }
}
