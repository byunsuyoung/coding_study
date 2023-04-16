const fs = require('fs');
const inputData = fs.readFileSync(0, 'utf8').toString().split(' ');

const a = parseInt(inputData[0]);
const b = parseInt(inputData[1]);

console.log(a+b);
console.log(a-b);
console.log(a*b);
// 몫을 구하는 연산자가 따로 존재하지 않아서
// console.log(parseInt(a/b));  - 이것도 가능하다. 
console.log(Math.floor(a/b)); 
console.log(a%b);