"""
B의 가장 큰 수와 A의 가장 작은 수를 곱하게 하면 된다.
B의 max index를 찾아내어 그 위치에 A의 min을 넣는다
B의 두번째 큰 수의 index와  A의 두번째 작은 수의 index를 맞춘다.
...
그럼 성공.
"""

n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
a.sort()
b.sort(reverse=True)

s = 0
for i in range(n):
    s += a[i] * b[i]
print(s)
