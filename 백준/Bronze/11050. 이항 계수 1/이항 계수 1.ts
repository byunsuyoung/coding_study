const fs = require('fs');
const [n, k]: number[] = fs.readFileSync('/dev/stdin').toString().split(' ').map((v) => parseInt(v));

const fact = function func(n: number): number {
    return n < 2 ? 1 : n * func(n - 1);
};

console.log(fact(n) / (fact(k) * fact(n - k)));