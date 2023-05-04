def solution(price):
    answer = 0
    if 500000 <= price:
        answer = price * 0.80
    elif 300000 <= price < 500000:
        answer = price * 0.90
    elif 100000 <= price:
        answer = price * 0.95
    else: answer = price    
    return int(answer)