function solution(array) {
    let max = Math.max(...array);
    var answer = [max, array.indexOf(max)];
    return answer;
}