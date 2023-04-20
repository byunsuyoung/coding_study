N = int(input())

li = []
for _ in range(N): 
    age, name = map(str, input().split())
    age = int(age)
    li.append((age, name))
    
li.sort(key = lambda parameter_list: parameter_list[0]) # 우선 순위 설정

for i in li:
    print(i[0], i[1])