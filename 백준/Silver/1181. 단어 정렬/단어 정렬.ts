const input = `${require("fs").readFileSync(0,"utf-8")}`.trim().split("\n");
const N = input.shift()

function solution(input: string[]) {
    const wordList = Array.from(new Set(input));
    console.log(
      wordList
        .sort((a, b) => a.length - b.length || a.localeCompare(b))
        .join("\n")
  );
}
solution(input);

//  localeCompare() : 인수로 지정된 문자열이 정렬상 string 객체의 문자열 뒤에 있으면 -1, 
//                    그 반대의 경우는 1, 동등한 경우에는 0을 반환