const inputs = require('fs').readFileSync(0).toString().trim().split('\n');
const t = Number(inputs[0]) // n
const result: number[] = []

const ncr = (n: number, r: number): number => {
  let result = 1
  for (let i = 0; i < r; i++) {
    result *= (n - i)
    result /= (i + 1)
  }
  return result
}

for (let i = 0; i < t; i++) {
  const [n, m] = inputs[i + 1].split(' ').map(Number)
  result.push(ncr(m, n))
}

console.log(result.join('\n'))