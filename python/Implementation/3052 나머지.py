num_list = []
for i in range(10):
    num_list.append(int(input()) % 42)

print(num_list)

print(len(set(num_list)))