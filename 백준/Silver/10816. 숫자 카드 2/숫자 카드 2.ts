import fs = require('fs');
const [n, card, m, find] = fs.readFileSync(0).toString().trim().split('\n');

//prev : 이전값(현재까지 누적된 값), curr: 현재값
const card_map = card.split(' ').map(Number).reduce<Map<number, number>>((prev, curr) => { 
    // ?? : 앞에 오는 값이 null 또는 undefined이면 뒤에오는 값을, 아니면 null 또는 undefined을 반환
    prev.set(curr, (prev.get(curr) ?? 0) + 1); 
    return prev;
}, new Map());

const result = find.split(' ').map((v) => card_map.get(+v) || 0);

console.log(result.join(' '));