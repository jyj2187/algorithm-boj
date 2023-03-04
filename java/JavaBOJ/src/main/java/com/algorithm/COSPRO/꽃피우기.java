package com.algorithm.COSPRO;

import java.util.LinkedList;
import java.util.Queue;

public class 꽃피우기 {
    /*
    #문제1
    n x n 크기 격자 모양 정원에 칸마다 핀 꽃 또는 피지 않은 꽃을 심었습니다. 이 정원의 꽃이 모두 피는 데 며칠이 걸리는지 알고 싶습니다. 핀 꽃은 하루가 지나면 앞, 뒤, 양옆 네 방향에 있는 꽃을 피웁니다.
    정원 크기 n과 현재 정원의 상태를 담은 2차원 배열 garden이 주어졌을 때, 모든 꽃이 피는데 며칠이 걸리는지 return 하도록 solution 메소드를 작성해주세요.

    ---
    #####매개변수 설명
    정원 크기 n과 현재 정원 상태를 담은 2차원 배열 garden이 solution 메소드의 매개변수로 주어집니다.
    * 정원 크기 n은 1보다 크고 100 보다 작거나 같은 자연수입니다.
    * 정원 상태를 담은 2차원 배열 garden의 원소는 0 또는 1 입니다.
    * 이미 핀 꽃은 1로 아직 피지 않은 꽃은 0으로 표현합니다.
    * 정원에 최소 꽃 한 개는 피어 있습니다.

    ---
    #####return 값 설명
    꽃이 모두 피는데 며칠이 걸리는지 return 합니다.

    ---
    #####예시

    | n | garden                        	| return |
    |---|-----------------------------------|--------|
    | 3 | [[0, 0, 0], [0, 1, 0], [0, 0, 0]] | 2  	|
    | 2 | [[1, 1], [1, 1]]              	| 0  	|

    #####예시 설명
    예시 #1
    첫 날 정원은 아래와 같습니다.
      ![ex1-1.jpg](https://grepp-programmers.s3.amazonaws.com/files/ybm/37bda7d9f3/31e62cd8-a1f4-4b48-bc9f-77760bab6d95.jpg)

    1일이 지난 정원의 상태는 아래와 같습니다.
      ![ex1-2.jpg](https://grepp-programmers.s3.amazonaws.com/files/ybm/ecc95dcb73/92fc1442-9e02-4cc9-9283-a268e5b17c95.jpg)

    2일이 지난 정원의 상태는 아래와 같습니다.
      ![ex1-3.jpg](https://grepp-programmers.s3.amazonaws.com/files/ybm/d5956891e7/e51e8c3b-2658-46f5-a339-7dba4f2e5aa1.jpg)

    따라서, 2일이 지나면 정원의 모든 꽃이 핍니다.

    예시 #2
    첫 날 화단의 상태는 아래와 같습니다.
      ![ex2-1.jpg](https://grepp-programmers.s3.amazonaws.com/files/ybm/9911040aaf/db95217b-f1b7-4ab3-b932-d15133431346.jpg)

    따라서, 0일이 지나면 정원의 모든 꽃이 핍니다.
     */

        // Flower 객체 생성 (체크용)
        class Flower {
            int x;
            int y;
            int day;

            public Flower(int x, int y, int day) {
                this.x = x;
                this.y = y;
                this.day = day;
            }
        }

        // 좌표 X Y 배열 선언 (작업 간편화)
        // 각 배열의 동일한 인덱스로 요소를 호출하여 현재 위치의 상하좌우를 체크한다.
        public static int[] dx = {-1, 1, 0, 0};
        public static int[] dy = {0, 0, -1, 1};

        /*
        큐를 만들어서 값이 1인 꽃을 집어넣고
        꽃의 상하좌우를 체크한디.
        이 때, 검사하는 위치가 정원의 바깥이면 continue; 다음 요소로 넘어간다.
        0이면 1로 바꾸고 해장 좌표와 현재 일 수를 새 꽃 정보로 만들어 큐에 집어넣는다.
        언제까지? 정원의 모든 요소를 검사해서 꽃 큐가 빌 때까지
         */
        public int solution(int[][] garden) {
            // 여기에 코드를 작성해주세요.

            Queue<Flower> flowerQ = new LinkedList<>();

            int answer = 0;
            for (int i = 0; i < garden.length; i++) {
                for (int j = 0; j < garden.length; j++) {
                    if (garden[i][j] == 1) {
                        flowerQ.offer(new Flower(i, j, 0));
                    }
                }
            }

            while (!flowerQ.isEmpty()) {
                Flower flower = flowerQ.poll();

                for (int i = 0; i < 4; i++) {
                    int nextX = flower.x - dx[i];
                    int nextY = flower.y - dy[i];
                    int nextDay = flower.day + 1;

                    if (nextX < 0 || nextY < 0 || nextX >= garden.length || nextY >= garden.length) {
                        continue;
                    }

                    if (garden[nextX][nextY] == 0) {
                        garden[nextX][nextY] = 1;
                        answer = nextDay;
                        flowerQ.offer(new Flower(nextX, nextY, nextDay));
                    }
                }
            }

            return answer;
        }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        꽃피우기 sol = new 꽃피우기();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}