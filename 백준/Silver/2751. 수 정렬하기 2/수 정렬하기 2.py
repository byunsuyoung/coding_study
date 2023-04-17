import sys
n = int(input())
list = []
for i in range(n):
    list.append(int(sys.stdin.readline())) # str형으로 받아지므로 정수로 사용할 때 형 변환에 유의
                                           # 개행 문자까지 포함한 하나의 줄을 한 번에 버퍼로 입력받는다.
for i in sorted(list):
    sys.stdout.write(str(i)+'\n')