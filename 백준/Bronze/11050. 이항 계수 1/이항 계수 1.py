import sys
n, k = map(int, sys.stdin.readline().split())

def fact(x): 
    if x <= 1: 
        return 1
    return x * fact(x-1)

print(fact(n) // (fact(k) * fact(n-k)))