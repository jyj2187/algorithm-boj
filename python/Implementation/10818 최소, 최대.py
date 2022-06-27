n = int(input())
numbers = list(map(int, input().split()))

# print(max(numbers))
# print(min(numbers))

# 반복문을 이용한 방법
# max_num = 0
# for i in numbers:
#     if i > max_num:
#         max_num = i
#
# min_num = 0
# for i in numbers:
#     if i < min_num:
#         min_num = i
# print(max_num)
# print(min_num)
#
# # 배열 정렬
# numbers = sorted(numbers)
# print(numbers[0])
# print(numbers[-1])