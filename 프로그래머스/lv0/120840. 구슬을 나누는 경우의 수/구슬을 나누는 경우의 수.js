function fact(n) {
  let answer = 1;
  if (n === 0) return 1;
  while (n > 1) answer *= n--;
  return Math.round(answer);
}

function solution(balls, share) {
    var answer = Math.round(fact(balls) / fact(balls - share) / fact(share));
    return answer;
}