A = int(input())
B = int(input())
C = int(input())
ABC = A * B * C

print(ABC)
num_list = list(map(int, str(ABC)))
print(num_list)

count = 0
for x in range(9):
    count = num_list.count(x)
    print(count)