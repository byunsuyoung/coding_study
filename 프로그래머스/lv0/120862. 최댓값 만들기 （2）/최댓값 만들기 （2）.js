function solution(numbers) {
    var li = [];
    for(let i = 0; i < numbers.length - 1; i++){
        for(let j = i + 1; j < numbers.length; j++){
            li.push(numbers[i] * numbers[j]);
        }
    }
    var answer = Math.max(...li);
    return answer;
}