import sys

N = int(input())
card = list(map(int, sys.stdin.readline().split()))

M = int(input())
check = list(map(int, sys.stdin.readline().split()))

card.sort() # 이진 탐색시 배열 정렬 필수

# 이진 탐색 사용
def binary_search(array, search, start, end):
    while start <= end:
        mid = (start + end) // 2

        if array[mid] == search:
            return mid
        elif array[mid] > search: 
            end = mid - 1 # 좌측 대상 다시 탐색
        else: 
            start = mid + 1 # 우측대상 다시 탐색
    return None

for i in range(M):
    if binary_search(card, check[i], 0, N - 1) is not None:
        print(1, end=' ')
    else:
        print(0, end=' ')