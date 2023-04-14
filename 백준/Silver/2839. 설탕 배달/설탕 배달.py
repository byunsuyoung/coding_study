N = int(input())
bag = 0
while N >= 0 :
    if N % 5 == 0 :  # 5의 배수이면
        bag += (N // 5)  
        print(bag)
        break
    N -= 3  # 5의 배수가 될 때까지 
    bag += 1  
else :
    print(-1)