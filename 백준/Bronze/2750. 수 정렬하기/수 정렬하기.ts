const fs = require('fs');
const input = fs.readFileSync(0, 'utf8').toString().trim().split("\n").map((item) => Number(item));

const list = input.shift(); // 배열 길이

input.sort((a,b) => a - b); // sort는 매개 변수가 없으면 유니코드로 정렬하기 때문에 (a,b) => a - b 표시 해주어야함

for(let i = 0; i < list; i++){
    console.log(input[i]);
}