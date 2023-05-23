const fs = require('fs');
const input = fs.readFileSync(0, 'utf8').toString().trim().split(' ');

const a: bigint = BigInt(input[0]);
const b: bigint = BigInt(input[1]);
const c: bigint = BigInt(input[2]);

console.log((a + b + c).toString().replace('n', ''));