import sys
import math
input = sys.stdin.readline

# 정수론 사용 소수
def check(x):
    if x == 0 or x == 1:
        return False
    # math.sqrt(x): x 의 제곱근을 리턴
    for i in range(2, int(math.sqrt(x))+1):
        if x % i == 0:
            return False
    return True

n = int(input())
for i in range(n):
    z = int(input())
    while True:
        if check(z):
            print(z)
            break
        else:
            z += 1