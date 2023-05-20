def solution(n: int, m: int, section: list) -> int:
    answer = 1
    curr = section[0]
    for i in section:
        if curr + m <= i:
            answer += 1
            curr = i

    return answer