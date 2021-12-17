function solution(s) {
  const len = s.length;
  const i = Math.floor(len / 2);
  if (len % 2 == 0)
    return s[i-1] + s[i];
  else
    return s[i];
}

console.log(solution("abcde"));
console.log(solution("qwer"));
