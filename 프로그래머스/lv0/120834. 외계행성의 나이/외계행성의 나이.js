function solution(age) {
    let str = 'abcdefghij';
    var answer = Array.from(age.toString()).map(t => str[+t]).join('');
    return answer;
}