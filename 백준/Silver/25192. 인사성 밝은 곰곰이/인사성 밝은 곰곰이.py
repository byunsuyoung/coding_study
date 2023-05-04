def enter(n):
    s = set()
    cnt = 0
    for i in range(n):
        record = input()
        if record == 'ENTER':
            s.clear() # 초기화  
       	elif record != 'ENTER':
            if record not in s:  
                cnt += 1           
                s.add(record)  
    return cnt

n = int(input())
print(enter(n)) 