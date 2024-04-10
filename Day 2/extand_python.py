num = [1,33, 31, 5, 26, 7, 8]
n = 7
flag = 0

for i in num:
    if(i == n):
        flag = 1
    else:
        continue
if(flag == 1):
    print(n)
else:
    print("ERROR")