const n = Number(require('fs').readFileSync(0).toString().trim());

const fact = (n: number): number => {
    if (n === 0) {
        return 1;
    }
    return n * fact(n - 1);
}

console.log(fact(n));