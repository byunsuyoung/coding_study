const fs = require('fs');
// const [t, ...input]: string[] = ['3', '1 45000', '6 10', '13 17'];
const [t, ...input]: string[] = fs
    .readFileSync(0,'utf-8')
    .toString()
    .trim()
    .split('\n');

// 유클리드 알고리즘 사용
function getGCD(num1: number, num2: number): number {
    const currentValue = num1 % num2;
    if (currentValue === 0) {
        return num2;
    }
    return getGCD(num2, currentValue);
}

function LCM(list: string[]): void {
    if (list.length === 0) {
        return;
    }
    const numbers: number[] = (list.pop() || '') //list.pop() : 리스트의 맨마지막요소 리턴하고 삭제
        .split(' ')
        .map((v) => parseInt(v));
    console.log((numbers[0] * numbers[1]) / getGCD(numbers[0], numbers[1]));
    return LCM(list);
}

LCM(input.reverse());