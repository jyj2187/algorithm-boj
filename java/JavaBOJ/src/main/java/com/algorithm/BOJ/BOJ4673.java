package com.algorithm.BOJ;

/**
 * 셀프 넘버
 */
public class BOJ4673 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int index = new BOJ4673().d(i);
            if (index < 10001) {
                arr[index] = true;
            }
        }

        for (int i= 1; i < 10001; i++) {
            if (!arr[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    int d(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
