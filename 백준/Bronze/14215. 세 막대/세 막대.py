a, b, c = map(int, input().split())
l_side = max(a, b, c)
s_sides = sum((a, b, c)) - l_side

while l_side >= s_sides:
    l_side -= 1
print(l_side + s_sides)