function solution(numbers, k) {
     while (k != 1) {
        numbers.push(numbers.shift());
        numbers.push(numbers.shift());
        k --;
    }
    var answer = numbers[0];
    return answer;
}