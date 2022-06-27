num = int(input())
temp = num
cycle, result = 0, 0

while True:
    result = (num // 10) + (num % 10)
    num = (num % 10) * 10 + (result % 10)
    cycle += 1
    if num == temp:
        break

print(cycle)
