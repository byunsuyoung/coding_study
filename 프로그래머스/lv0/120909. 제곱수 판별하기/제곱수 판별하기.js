function solution(n) {
    // Math.sqrt():  숫자의 제곱근을 반환 
if(Math.sqrt(n) % 1 === 0){
        return 1;
    }
    return 2;
}