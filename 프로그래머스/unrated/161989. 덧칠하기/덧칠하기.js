function solution(n, m, section) {
  var answer = 0;
  let curr = 0;
  section.forEach((n) => {
    if (n > curr) {
      curr = n + m - 1;
      answer++;
    }
  });
  return answer;
}