function solution(my_string) {
    const regex = /[aeiou]/g;
    var answer = my_string.replace(regex,'');
    return answer;
}