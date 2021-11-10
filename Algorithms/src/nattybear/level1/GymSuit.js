function solution(n, lost, reserve) {

  const f = (x, y) => x - y;

  lost.sort(f);
  reserve.sort(f);

  function helper(predicate) {
    for (let i = 0; i < lost.length; i++) {
      for (let j = 0; j < reserve.length; j++) {
        let los = lost[i];
        let res = reserve[j];
        if (predicate(los, res)) {
          lost[i] = -1;
          reserve[j] = -1;
          break;
        }
      }
    }
  }

  helper((x, y) => x == y);
  helper((x, y) => Math.abs(x - y) == 1);

  const lost_ = lost.filter(x => x != -1);

  return n - lost_.length;
}

console.log(solution(5, [2,4], [1,3,5]));
console.log(solution(5, [2,4], [3]));
console.log(solution(3, [3], [1]));
console.log(solution(5, [2,3], [3,4]));
