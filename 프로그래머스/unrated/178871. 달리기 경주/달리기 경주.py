def solution(players, callings):
    # enumerate(): 리스트의 원소에 순서값을 부여해주는 함수
    result = {player: i for i, player in enumerate(players)} # 선수: 등수
    for who in callings:
        idx = result[who] 
        result[who] -= 1
        result[players[idx-1]] += 1 
        players[idx-1], players[idx] = players[idx], players[idx-1] # 위치변경
    return players