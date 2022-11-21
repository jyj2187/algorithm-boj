package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
//        sort(arr);
        quickSort(arr, 0, arr.length - 1);
        for (Integer i : arr) {
            System.out.println(i);
        }
    }

    static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(arr, low, high);

        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    static int partition(int[] arr, int left, int right) {
        int low = left;
        int high = right;
        int pivot = arr[right];

        while (low < high) {
            while (arr[low] < pivot && low < high) {
                low++;
            }

            while (arr[high] >= pivot && low < high) {
                high--;
            }

            swap(arr, right, high);
        }
        return high;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
