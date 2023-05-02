const [a, b, c] = require('fs').readFileSync(0).toString().trim().split(' ').map(Number);
const result = [];

result.push((a + b) % c);
result.push(((a % c) + (b % c)) % c);
result.push((a * b) % c);
result.push(((a % c) * (b % c)) % c);

console.log(result.join('\n'));