def solve():
  data = input()
  stack = []
  for item in data:
    if item == '(':
      stack.append(item)
    else:
      if len(stack) == 0:
        print("NO")
        return
      else:
        stack.pop()
        
  if len(stack) == 0:
    print("YES")
  else:
    print("NO")
 
T = int(input())
for _ in range(T):
  solve()
 