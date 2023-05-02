const n = parseInt(require('fs').readFileSync(0,'utf-8').toString().trim())

console.log(n*(n-1))