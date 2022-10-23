package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * 스택
 */

public class BOJ10828 {
    public static class Stack {
        private ArrayList<Integer> listStack;

        public Stack(ArrayList listStack) {
            this.listStack = listStack;
        }

        public void push(Integer data) {
            listStack.add(data);
        }

        public Integer pop() {
            if (listStack.size() == 0) {
                return -1;
            } else {
                return listStack.remove(listStack.size() - 1);
            }
        }

        public int size() {
            return listStack.size();
        }

        public Integer top() {
            if (listStack.size() == 0) {
                return -1;
            } else {
                return listStack.get(listStack.size() - 1);
            }
        }

        public Integer empty() {
            if (listStack.size() == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public String show() {
            return listStack.toString();
        }

        public void clear() {
            listStack.clear();
        }
    }

    public static void main(String[] args) throws IOException {
        Stack stack = new Stack(new ArrayList<>());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            str = br.readLine();
            String[] strArr = str.split(" ");
            switch (strArr[0]) {
                case "push" :
                    int data = Integer.parseInt(strArr[1]);
                    stack.push(data);
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
            }
        }
    }
}
