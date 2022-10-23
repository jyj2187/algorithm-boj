package com.algorithm;

import java.io.*;
import java.util.Stack;

/**
 * 스택 수열
 */

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int index = 0;

        while (T-- > 0) {
            int input = Integer.parseInt(br.readLine());

            if (index < input) {
                for (int i = index; i < input; i++) {
                    stack.push(i + 1);
                    sb.append("+\n");
                }
                index = input;
            } else if (stack.peek() != input) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
