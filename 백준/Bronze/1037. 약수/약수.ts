const fs = require('fs');
const [[n], a] = fs.readFileSync('/dev/stdin').toString().trim().split('\n')
    .map((li) => li.trim().split(' ').map(Number));
a.sort((a, b) => a - b);
console.log(a[0] * a[n-1]);