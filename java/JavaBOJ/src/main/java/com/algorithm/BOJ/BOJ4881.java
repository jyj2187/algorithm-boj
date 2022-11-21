package com.algorithm.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 자릿수의 제곱
 */

public class BOJ4881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while ((str = br.readLine()) != null) {
            String[] strArr = str.split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            if (a == 0 && b == 0) {
                return;
            }

            List<Integer> aList = new ArrayList<>();
            aList.add(a);

            List<Integer> bList = new ArrayList<>();
            bList.add(b);

            int n = a;
            while (true) {
                //변환

                n = getNextNumber(n);
                //변환한거 가지고있는거 아니냐?
                if (aList.contains(n)) {
                    break;
                }
                //아님 추가하셈
                aList.add(n);
            }

            int m = b;
            while (true) {
                //변환
                m = getNextNumber(m);
                //변환한거 가지고있는거 아니냐?
                if (bList.contains(m)) {
                    break;
                }
                //아님 추가하셈
                bList.add(m);
            }

            List<Integer> answers = new ArrayList<>();

            //각 수열 리스트를 얻었다.
            for (Integer aInt : aList) {
                if (bList.contains(aInt)) {
                    answers.add(aInt);
                }
            }

            if (answers.isEmpty()) {
                System.out.println(a + " " + b + " " + 0);
            } else {
                //각각에대해 최솟값 찾기
                List<Integer> realAnswerList = new ArrayList<>();
                for (Integer answer : answers) {
                    realAnswerList.add(aList.indexOf(answer) + 1 + bList.indexOf(answer) + 1);
                }
                System.out.println((a + " " + b + " " + realAnswerList.stream().sorted().collect(Collectors.toList()).get(0)));
            }
        }
    }

    //다음 수 제조기
    public static int getNextNumber(int n) {
        int power = 0;
        while (n > 0) {
            power = power + ((n % 10) * (n % 10));
            n /= 10;
        }
        return power;
    }
}

