const fs = require("fs");
const [numerators, denominators] = fs.readFileSync(0,"utf-8").toString().trim().split("\n");

let [a, b] = numerators.split(" ").map(BigInt);
let [c, d] = denominators.split(" ").map(BigInt);

let numerator = a * d + c * b;
let denominator = b * d;

const gcd = (x, y) => {
  if (y == 0) return x;
  else return gcd(y, x % y);
};

const divisor = gcd(numerator, denominator);

console.log(`${numerator / divisor} ${denominator / divisor}`);