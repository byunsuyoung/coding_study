function solution(s1, s2) {
    const intersection = s1.filter((x) => s2.includes(x));
    var answer = intersection.length;
    return answer;
}