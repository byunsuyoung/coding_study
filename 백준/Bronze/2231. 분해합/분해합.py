n = int(input())
 
for i in range(n):
    temp = sum(map(int, str(i)))
    result = i + temp
    if result == n:
        print(i)
        break
else:
    print(0)