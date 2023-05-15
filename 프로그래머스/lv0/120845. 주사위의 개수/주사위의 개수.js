function solution(box, n) {
    var answer = box.map(a => a/n<<0).reduce((a,b) => a*b,1);
    return answer;
}