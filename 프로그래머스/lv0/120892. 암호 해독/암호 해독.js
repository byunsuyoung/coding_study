function solution(cipher, code) {
    var answer = cipher.split('').filter((_, index) => (index + 1) % code === 0).join('');;
    return answer;
}