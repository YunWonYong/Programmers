function solution(participant, completion) {
  const map = new Map();

  for (let c of completion) {
    if (map.get(c) == undefined)
      map.set(c, 1);
    else
      map.set(c, map.get(c) + 1);
  }

  for (let p of participant) {
    if (map.get(p) == undefined)
      return p;

    if (map.get(p) == 0)
      return p;

    map.set(p, map.get(p) - 1);
  }
}
