num_list = [3, 29, 38, 12, 57, 74, 40, 85, 61]
# for x in range(9):
#     num_list.append(int(input()))
max_index = 0
max_num = 0
for i in range(len(num_list)):
    if(max_num < num_list[i]):
        max_num = num_list[i]
        max_index = i + 1

print(max_num)
print(max_index)

print(max(num_list))
print(num_list.index(max(num_list)) + 1)