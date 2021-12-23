function solution(s) {
  let p = 0;
  let y = 0;
  for (let c of s) {
    c = c.toLowerCase();
    if (c == 'p')
      p++;
    else if (c == 'y')
      y++;
  }
  return p == y;
}
