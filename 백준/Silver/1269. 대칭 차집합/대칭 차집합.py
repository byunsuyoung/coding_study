import sys
input = sys.stdin.readline
n,m = map(int, input().split())

a = set(map(int, input().split()))
b = set(map(int, input().split()))

# len(a-b) : a집합에서 b집합을 뺀 차집합
# len(b-a) : b집합에서 a집합을 뺀 차집합
print(len(a-b) + len(b-a))