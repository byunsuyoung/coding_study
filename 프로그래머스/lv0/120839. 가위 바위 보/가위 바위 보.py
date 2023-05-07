def solution(rsp):
    d = {'0':'5','2':'0','5':'2'}
    answer = ''.join(d[i] for i in rsp)
    return answer