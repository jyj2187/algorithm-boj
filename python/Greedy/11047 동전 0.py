n, k = map(int, input().split())
coin = []

for i in range(n):
    coin.append(int(input()))

coin.reverse()
count = 0
for c in coin:
    count += k // c
    k = k % c

print(count)
