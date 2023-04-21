import sys
input = sys.stdin.readline

N,M = map(int,input().split())
s = {input().rstrip():True for _ in range(N)}
answer = 0

for _ in range(M):
    a = input().rstrip()
    if s.get(a) != None:
        answer+=1
print(answer)