const fs = require("fs");
let input = fs.readFileSync(0,'utf-8').toString().trim().split("\n");

const num = Number(input.shift());
let li = [];

// 2차원 배열 생성
for(let i = 0; i < num; i++){
    // input[i]를 하나의 배열로 만든 뒤, list 배열에 push
    li.push(input[i].split(" ").map((item) => Number(item))); 
}

// 2차원 배열 오름차순 정렬 구현
li.sort((a, b) => {
  if (a[0] === b[0]) { // arr[0][0]과 arr[1][0], arr[1][0]과 arr[2][0]...
    return a[1] - b[1] //arr[0][1]과 arr[1][1]...
  } else {
    return a[0] - b[0]
  }
});

let ans = [];

for(let i = 0; i < num; i++){
    let answer = li[i].join(" ");
    ans.push(answer);
}

console.log(ans.join("\n"));