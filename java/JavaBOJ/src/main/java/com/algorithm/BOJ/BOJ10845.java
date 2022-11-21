package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 큐
 */

public class BOJ10845 {
    public static class Queue {
        private ArrayList<Integer> listQueue;

        public Queue(ArrayList listQueue) {
            this.listQueue = listQueue;
        }

        public void push(Integer data) {
            listQueue.add(data);
        }

        public Integer pop() {
            if (listQueue.size() == 0) {
                return -1;
            }
            return listQueue.remove(0);
        }

        public int size() {
            return listQueue.size();
        }

        public int empty() {
            if (listQueue.size() == 0) {
                return 1;
            }
            return 0;
        }

        public Integer front() {
            if (listQueue.size() == 0) {
                return -1;
            }
            return listQueue.get(0);
        }

        public Integer back() {
            if (listQueue.size() == 0) {
                return -1;
            }
            return listQueue.get(listQueue.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BOJ10845.Queue queue = new BOJ10845.Queue(new ArrayList<>());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            String[] strArr = input.split(" ");
            switch (strArr[0]) {
                case "push" :
                    int data = Integer.parseInt(strArr[1]);
                    queue.push(data);
                    break;
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.empty()).append("\n");
                    break;
                case "front":
                    sb.append(queue.front()).append("\n");
                    break;
                case "back":
                    sb.append(queue.back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
