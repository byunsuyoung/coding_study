const input = require('fs').readFileSync(0,'utf-8').toString().split(' ').map(v => +v)
answer(input[0], input[1])
function answer(a, b) {
  console.log(a > b ? '>' : a < b ? '<' : '==')
}