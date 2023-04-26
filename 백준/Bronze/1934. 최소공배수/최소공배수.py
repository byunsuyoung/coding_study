n = int(input())

for i in range(n): 
    a,b = map(int, input().split())
    n1,n2 = a,b
    
    # 유클리드 알고리즘 사용
    # a/b를 후 나머지를 a에 저장
    # a와 b의 값을 서로 바꾸고, 다시 a와 b를 나눔 - 나머지 나누기 b를 하기 위함
    # 나머지가 0될 때까지 반복 - 나머지가 0이 되면 마지막으로 나누게 된 나머지가 최대공약수
    while n2 != 0: 
        temp = n1
        n1 = n2
        n2 = temp % n2
    print(a*b//n1) # 최소 공배수    