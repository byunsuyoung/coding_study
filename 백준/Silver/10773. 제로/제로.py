import sys
input = sys.stdin.readline
k = int(input())
li = []

for i in range(k): 
    n = int(input())
    if n == 0:
        li.pop()
    else: 
        li.append(n)
        
result = sum(li)
print(result)        