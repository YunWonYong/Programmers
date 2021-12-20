function solution(a, b) {

  const days = {
    0 : "FRI",
    1 : "SAT",
    2 : "SUN",
    3 : "MON",
    4 : "TUE",
    5 : "WED",
    6 : "THU"
  }

  const month = new Map();

  month.set(1, 31);
  month.set(2, 29);
  month.set(3, 31);
  month.set(4, 30);
  month.set(5, 31);
  month.set(6, 30);
  month.set(7, 31);
  month.set(8, 31);
  month.set(9, 30);
  month.set(10, 31);
  month.set(11, 30);
  month.set(12, 31);

  let sum = 0;

  for (let i = 1; i < a; i++)
    sum += month.get(i);

  sum += b-1;

  return days[sum % 7];
}

console.log(solution(5, 24));
console.log(solution(1, 1));
console.log(solution(2, 29));
