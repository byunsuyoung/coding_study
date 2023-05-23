const fs = require('fs');
let input = fs.readFileSync(0,'utf-8').toString();

input = +input;

if (input >= 90) {
	console.log("A");
} else if (input >= 80) {
	console.log("B");
} else if (input >= 70) {
	console.log("C");
} else if (input >= 60) {
	console.log("D");
} else if (input >= 0) {
	console.log("F");
}