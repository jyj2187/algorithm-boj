package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ROT13 암호
 */

public class BOJ11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            if (String.valueOf(input.charAt(i)).matches("[a-mA-M]")) {
                sb.append((char) (input.charAt(i) + 13));
            } else if (String.valueOf(input.charAt(i)).matches("[n-zN-Z]")) {
                sb.append((char) (input.charAt(i) - 13));
            } else {
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
