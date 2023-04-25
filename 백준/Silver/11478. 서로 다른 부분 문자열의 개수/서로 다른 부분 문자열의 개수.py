n = input()
a = set() # 부분 문자열을 저장할 a 선언

for i in range(len(n)): 
    for j in range(i, len(n)): 
        temp = n[i:j+1]
        a.add(temp)
print(len(a))        