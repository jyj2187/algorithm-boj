package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * 달팽이는 올라가고 싶다
 */
public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int up = Integer.parseInt(input[0]);
        int down = Integer.parseInt(input[1]);
        int height = Integer.parseInt(input[2]);

        System.out.println((height - up) % (up - down) == 0 ?
                (height - up) / (up - down) + 1 : (height - up) / (up - down) + 2);
    }
}
