function solution(n) {
    let answer = 1;
    let i = 1;
    while(i <= n) {
        answer++;
        i *= answer;
    }
    
    return answer -1;
}