import sys

input = sys.stdin.readline
N = int(input())

li = {}
for _ in range(N): 
    name, log = map(str, input().split())
    
    if log == 'enter': 
        li[name] = 'enter'
    else: 
        del li[name]
        
result = sorted(li.keys(), reverse = True)    

for i in result: 
    print(i)