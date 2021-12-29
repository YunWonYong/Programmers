function solution(strings, n) {
  strings.sort((s1, s2) => {
    const c1 = s1.charCodeAt(n);
    const c2 = s2.charCodeAt(n);
    const result = c1 - c2;
    if (result != 0)
      return result;
    else
      return s1.localeCompare(s2);
  });
  return strings;
}
