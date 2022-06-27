n = int(input())
change = 1000 - n

coin_type = [500, 100, 50, 10, 5, 1]
count = 0
for coin in coin_type:
    count += change // coin
    change %= coin

print(count)