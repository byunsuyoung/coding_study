def solution(array):
    while len(array) != 0:
        # enumerate(): 인덱스와 원소로 이루어진 튜플(tuple)을 만들어줌
        #              인자로 넘어온 목록을 기준으로 인덱스와 원소를 차례대로 접근하게 해주는 
        #              반복자(iterator)객체를 반환해주는 함수
        for i, a in enumerate(set(array)): # i = 인덱스, a = 요소
            array.remove(a)
        if i == 0: return a
    return -1