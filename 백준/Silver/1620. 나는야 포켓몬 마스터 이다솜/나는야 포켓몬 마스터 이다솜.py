import sys
input = sys.stdin.readline

N, M = map(int, input().split())

li_number = {}
li_name = {}
num = 1

for _ in range(N): 
    name = input().strip()
    li_number[name] = num
    li_name[num] = name
    num += 1
    
for _ in range(M): 
    q = input().strip()
    try:
        print(li_name[int(q)])
    except:
        print(li_number[q])