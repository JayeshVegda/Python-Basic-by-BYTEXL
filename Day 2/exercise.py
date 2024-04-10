count = 0

num_list = [1, 1, 5, 100, -20, -20, 6, 0, 0]

for x in range(len(num_list) - 1):
    if num_list[x] == num_list[x + 1]:
        print(num_list[x])
        count += 1 
print(count)
                     