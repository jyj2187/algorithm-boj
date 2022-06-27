n = int(input())
data = list(map(int, input().split()))
result = 0
data.sort()

"""
# 이중 반복문을 이용한 방법
for i in range(n):
    for j in range(i+1):
        result += data[j]
"""
"""
# sum을 이용한 방법
for i in range(n):
    result += sum(data[:i+1])
"""
"""
# 배열을 갱신해나가는 방법
for i in range(1, n):
    data[i] += data[i-1]
print(sum(data))
"""

print(result)
