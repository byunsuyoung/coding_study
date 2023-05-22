function solution(cards1, cards2, goal) {
  for (let str of goal) {
      // shift() 메소드를 사용하면 배열의 맨 앞의 원소를 제거
    if (str === cards1[0]) cards1.shift();
    else if (str === cards2[0]) cards2.shift();
    else return "No";
  }
  return "Yes";
}