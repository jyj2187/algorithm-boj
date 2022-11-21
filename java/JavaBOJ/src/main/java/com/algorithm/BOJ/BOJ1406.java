package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 에디터 문제
 */

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        String[] originArr = br.readLine().split("");
        for (String str : originArr) {
            leftStack.push(str);
        }

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String operator = br.readLine();
            switch (operator) {
                case "L":
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case "D":
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case "B":
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                default:
                    leftStack.push(String.valueOf(operator.charAt(2)));
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}
