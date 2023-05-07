function solution(rsp) {
    var obj = {"0" : 5, "2" : 0, "5" : 2}
    var answer = rsp.split('').map(x => obj[x]).join('');
    return answer;
}