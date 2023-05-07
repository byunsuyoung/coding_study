import sys
input = sys.stdin.readline

n = int(input())
d = {'ChongChong'}
for i in range(1, n+1):
    a, b = input().rstrip().split()
    if a in d:
        d.add(b)
    if b in d:
        d.add(a)

print(len(d))