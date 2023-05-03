def solution(n):
    answer = 1
    a = 6
    while True:
        if a % n == 0:
            return answer
        else:
            a += 6
            answer += 1
    return answer        