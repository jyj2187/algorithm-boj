package com.algorithm.BOJ;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

//        int[] arr = new int[T];
//        for (int i = 0; i < T; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        quickSort(arr, 0, arr.length - 1);

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
    }

//    static void sort(int[] arr) {
//        int temp;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    swap(arr, i, j);
//                }
//            }
//        }
//    }
    // 배열의 중간값을 피벗으로 사용.
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(arr, low, high);

        quickSort(arr, low, pivot);
        quickSort(arr, pivot + 1, high);
    }

    static int partition(int[] arr, int left, int right) {
        // lo와 hi는 각각 배열의 끝에서 1 벗어난 위치부터 시작한다.
        int low = left - 1;
        int high = right + 1;
        int pivot = arr[(left + right) / 2];    // 부분리스트의 중간 요소를 피벗으로 설정

        while (true) {

            /*
             * 1 증가시키고 난 뒤의 lo 위치의 요소가 pivot보다 큰 요소를
             * 찾을 떄 까지 반복한다.
             */
            do {
                low++;
            } while (arr[low] < pivot);

            /*
             * 1 감소시키고 난 뒤의 hi 위치가 lo보다 크거나 같은 위치이면서
             * hi위치의 요소가 pivot보다 작은 요소를 찾을 떄 까지 반복한다.
             */
            do {
                high--;
            } while (arr[high] > pivot && low <= high);

            /*
             * 만약 hi가 lo보다 크지 않다면(엇갈린다면) swap하지 않고 hi를 리턴한다.
             */
            if(low >= high) {
                return high;
            }

            // 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
            swap(arr, low, high);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
