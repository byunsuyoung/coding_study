function solution(my_string, n) {
    var answer = [...my_string].map(char => char.repeat(n)).join('');
    return answer;
}