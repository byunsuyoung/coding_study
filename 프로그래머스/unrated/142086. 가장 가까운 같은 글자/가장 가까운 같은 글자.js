function solution(s) {
    var answer = [...s].map((v, i)=> {
        // s.slice(0, i): 시작 인덱스부터 종료 인덱스까지 값을 복사하여 반환
        const slice = s.slice(0, i);
        if (slice.includes(v)) {
            return i - slice.lastIndexOf(v);
        } else {
            return -1;
        }
    });
    return answer;
}