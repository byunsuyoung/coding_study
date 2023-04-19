import sys

input = sys.stdin.readline
N = int(input())

list = []
for _ in range(N): 
    x, y = map(int,input().split())
    list.append([x,y])

list.sort(key = lambda x: (x[1], x[0])) # key인자에 함수 넣으면 우선순위 지정됨

for i in range(N): 
    print(list[i][0], list[i][1])