n, x = map(int, input().split())
data = list(map(int, input().split()))

for i in range(n):
    if data[i] < x:
        print(data[i], end=" ")

# my_list = [i for i in A if i<X ]
# print(" ".join(map(str, my_list)))