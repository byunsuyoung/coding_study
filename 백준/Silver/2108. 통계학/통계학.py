import sys
from collections import Counter

n = int(sys.stdin.readline())
li = []

for i in range(n):
    li.append(int(sys.stdin.readline()))
    
print(round(sum(li) / n)) # 산술 평균

li.sort()

print(li[n // 2]) # 중앙값

# most_common(): 빈도수가 높은 순으로 리스트 안의 튜플형태로 반환
nums_s = Counter(li).most_common()

if len(nums_s) > 1: # 최빈값
    if nums_s[0][1] == nums_s[1][1]:
        print(nums_s[1][0])
    else:
        print(nums_s[0][0])
else:
    print(nums_s[0][0])
    
print(li[-1] - li[0])# 범위