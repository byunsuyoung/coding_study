N = int(input())
list = []

for _ in range(N):
    list.append(int(input()))
    
num = sorted(list)
for i in num:
    print(i)