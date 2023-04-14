N, M = map(int, input().split())
field = []
result = 10000000
w_row = 'WBWBWBWB'
b_row = 'BWBWBWBW'
for _ in range(N):
    field.append(list(map(str, input())))
for i in range(N-7):
    for j in range(M-7):
        first_w = 0
        first_b = 0
        for k in range(i, i+8):
            row = field[k][j:j+8]
            for v in range(8):
                if k % 2 == 0:
                    if w_row[v] != row[v]:
                        first_w += 1
                    if b_row[v] != row[v]:
                        first_b += 1
                else:
                    if b_row[v] != row[v]:
                        first_w += 1
                    if w_row[v] != row[v]:
                        first_b += 1
        result = min(result, first_w, first_b)
print(result)