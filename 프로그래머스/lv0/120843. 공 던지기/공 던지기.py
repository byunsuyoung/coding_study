def solution(numbers, k):
    answer = 2 * (k - 1) % numbers[-1] + 1
    return answer