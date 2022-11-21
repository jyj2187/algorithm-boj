package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열을 분석해서 소문자, 대문자, 숫자, 공백의 개수를 출력
 */

public class BOJ10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";

        while ((input = br.readLine()) != null) {

            int lowerCount = 0;
            int upperCount = 0;
            int numberCount = 0;
            int spaceCount = 0;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLowerCase(c)) {
                    lowerCount++;
                } else if (Character.isUpperCase(c)) {
                    upperCount++;
                } else if (Character.isDigit(c)) {
                    numberCount++;
                } else if (Character.isSpaceChar(c)) {
                    spaceCount++;
                }
            }
            sb.append(lowerCount).append(" ").append(upperCount).append(" ").append(numberCount).append(" ").append(spaceCount).append("\n");
        }
        System.out.println(sb);
    }
}
