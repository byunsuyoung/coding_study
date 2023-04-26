n = int(input())

for i in range(n): 
    a,b = map(int, input().split())
    n1,n2 = a,b
    
    # 유클리드 알고리즘 사용
    while n2 != 0: 
        temp = n1
        n1 = n2
        n2 = temp % n2
    print(a*b//n1) # 최소 공배수    