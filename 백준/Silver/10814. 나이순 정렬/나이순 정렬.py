import sys
input = sys.stdin.readline

N = int(input())

Person = []
for _ in range(N): # 리스트 형태로
    Person.append(list(input().split()))
    
Person.sort(key = lambda a: int(a[0])) # 우선 순위 설정

for i in range(N):
    print(Person[i][0], Person[i][1])