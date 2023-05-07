function solution(n) {
    var answer = [...Array(n).fill().map((v,i) => i+1)]
    .reduce((acc,cur) => n%cur ? acc : acc+1,0)
    return answer;
}