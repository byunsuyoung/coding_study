function solution(name, yearning, photo) {
  // ex) {may: 5, kein: 10, kain: 1, radi: 3}
  const memory = {};
  for (let i = 0; i < name.length; i++) {
    memory[name[i]] = yearning[i];
  }
  return photo.map((arr) =>
    // memory 객체에 해당 사람이 있으면 점수를 없으면 0을 더해준다.
    arr.reduce((acc, cur) => acc + (memory[cur] || 0), 0)
  );
}