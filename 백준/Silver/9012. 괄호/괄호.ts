import * as fs from "fs";
const [str1, ...strs] = fs.readFileSync(0,"utf-8").toString().trim().split("\n");
let answer = "";
strs.forEach((li) => {
  const len = li.length,
    arr: string[] = [];
  let yes = true;
  for (let i = 0; i < len; i++) {
    const a = li[i];
    switch (a) {
      case "(":
        arr.push(a);
        break;
      case ")":
        !arr.pop() && (yes = false);
        break;
    }
  }
  arr.length && (yes = false);
  answer += `${yes ? "YES" : "NO"}\n`;
});
console.log(answer.trim());