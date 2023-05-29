function solution(my_string) {
    let word = my_string.toLowerCase()
    let answer = word.split('').sort().join('')
    return answer;
}