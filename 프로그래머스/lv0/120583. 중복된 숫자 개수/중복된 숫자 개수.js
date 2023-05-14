function solution(array, n) {
    var answer = array.filter(array => array == n).length;
    return answer;
}