package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }

        int answer = solution(N, a);
        System.out.println(answer);
    }

    public static int solution(int N, int[] a) {
        int answer = 0;

        for (int i = 1; i < N - 1; i++) {
            if (a[i] != 1 && a[i] != 7) {
                while (a[i - 1] != a[i] - 1 || a[i + 1] != a[i] + 1) {
                    a[i - 1] -= 1;
                    a[i + 1] += 1;
                    answer++;
                }
            }
            if (a[i] == 1) {
                while (a[i - 1] != 7 || a[i + 1] != 2) {
                    a[i - 1] -= 1;
                    a[i + 1] += 1;
                    answer++;
                }
            }

            if (a[i] == 7) {
                while (a[i - 1] != 6 || a[i+1] != 1) {
                    a[i - 1] -= 1;
                    a[i + 1] += 1;
                    answer++;
                }
            }
        }

        return answer;
    }
}
