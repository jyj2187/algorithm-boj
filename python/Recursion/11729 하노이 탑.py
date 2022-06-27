# 하노이의 탑
# 입력 : 옮길 원반의 개수 n
#   옮길 원반이 현재 있는 출발점 from_pos
#   원반이 도착할 기둥 to_pos
#   보조 기둥 aux_pos
# 출력 : 원반을 옮기는 순서

def hanoi(n, from_pos, to_pos, aux_pos):
    if n == 1:
        print(from_pos, to_pos)
        return
    # 원반 n-1을 보조기둥으로 이동(이때는 도착기둥이 보조기둥이 된다.)
    hanoi(n - 1, from_pos, aux_pos, to_pos)
    # 가장 큰 원반을 목적지로 이동
    print(from_pos, to_pos)
    # 원반 n-1을 도착기둥으로 이동(이때는 출발기둥이 보조기둥이 된다.
    hanoi(n - 1, aux_pos, to_pos, from_pos)


# print("원반의 갯수 : 1")
# hanoi(1, 1, 3, 2)
# print()
# print("원반의 갯수 : 2")
# hanoi(2, 1, 3, 2)
# print()
# print("원반의 갯수 : 3")
# hanoi(3, 1, 3, 2)
n = int(input())
print(2 ** n - 1)
hanoi(n, 1, 3, 2)
