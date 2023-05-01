import math
import sys
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
        
m, n = map(int, input().split())  

for i in range(m, n+1): # m부터 n까지
    if check(i): 
        print(i)