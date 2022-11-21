package com.algorithm.BOJ;

import java.io.*;
import java.util.Stack;

/**
 * 괄호
 */

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            if (function(br.readLine())) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }

    static boolean function(String str) {
        if (str.isEmpty()) return true;
        if (str.startsWith(")") || str.endsWith("(")) return false;

        Stack<String> openBrackets = new Stack<>();
        String[] strArr = str.split("");
        for (String bracket : strArr) {
            if (bracket.equals("(")) {
                openBrackets.push(bracket);
            } else if (bracket.equals(")")) {
                if (openBrackets.isEmpty()) {
                    return false;
                }
                openBrackets.pop();
            }
        }
        return openBrackets.isEmpty();
    }
}
