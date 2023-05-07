function solution(hp) {
    const a = parseInt(hp/5);
    const b = parseInt( ( hp % 5 ) / 3);
    const c = ( hp % 5 ) % 3;
    
    var answer = a + b + c;
    return answer;
}