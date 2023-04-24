import fs = require('fs');
const [counts, ...inputs] = fs.readFileSync(0).toString().trim().split('\n');
const [n, m] = counts.split(' ').map(Number);

let set = new Set<string>();
const result = inputs.reduce<string[]>((prev, curr) => { //prev : 이전값(현재까지 누적된 값), curr: 현재값
    if (set.has(curr)) {
        prev.push(curr);
    } else {
        set.add(curr);
    }
    return prev;
}, []).sort();

console.log(result.length !== 0 ? result.length + '\n' + result.join('\n') : result.length);