function solution(t, p) {
    const tArr = [...t].map((_, i)=>t.slice(i, i+p.length));
    const answer = tArr.filter((v)=> v.length === p.length && +v <= +p).length;
    return answer;
}