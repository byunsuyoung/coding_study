import sys
input = sys.stdin.readline
n,m = map(int, input().split())

dict = {}
for _ in range(n):
	name = input().strip()
	if len(name) < m:
		continue
	if dict.get(name):
		dict[name][0] += 1
	else:
		dict[name] = [1, len(name), name]
# 개수, 길이는 내림차순으로 단어는 사전순으로 정렬
answer = sorted(dict.items(), key= lambda x: (-x[1][0], -x[1][1], x[1][2]))

for a in answer:
	print(a[0])
