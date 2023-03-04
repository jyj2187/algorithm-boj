package com.algorithm.Programmers;

import java.util.*;

/*
    전화번호 목록

    두가지 접근 방법
    1. 번호의 시작 숫자가 다른 경우는 굳이 체크할 필요가 없다
    -> 말은 즉슨, 전체를 정렬한 후에 다음 숫자가 이전 숫자로 시작하는지만 체크하면 된다.
    -> 이중 반복문을 돌리더라도 예외 사항을 잘 체크하면 모든 리스트를 다 돌 필요가 없다.

    2. 해시를 이용한다.
    -> 일단, 해시를 이용하는 문제라서 해시로 풀 수 있다.
    -> 각 번호에 대한 접두어 목록(자신 제외)을 미리 자료구조에 저장한 뒤에
    -> 각 번호가 접두어 목록에 포함되는지를 체크한다.

    어느 것이 효율적인지는 구현 방식에 따라 조금씩 다르지 않을까
    결국은 순환을 해야 한다.
    자료구조를 이용하던 지지고 볶던 예외사항을 줄이는 것이 문제를 푸는 열쇠.
 */
public class PRO42577 {
    private static boolean solution(String[] phone_book) {
        boolean answer = true;
        for (String current : phone_book) {
            for (String check : phone_book) {
                if (Objects.equals(current, check) || check.length() > current.length() ) {
                    continue;
                }
                if (current.startsWith(check)) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    private static boolean solution2(String[] phone_book) {
        Set<String> heads = new HashSet<>();
        for (String pn : phone_book) {
            for (int i = 1; i < pn.length(); i++) {
                heads.add(pn.substring(0, i));
            }
        }
        for (String pn : phone_book) {
            if (heads.contains(pn)) {
                return false;
            }
        }
        return true;
    }

    public boolean solutionByGPT(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"12", "123", "1235", "567", "88"};
//        System.out.println(solution(phone_book));
        System.out.println(solution2(phone_book));
    }
}
