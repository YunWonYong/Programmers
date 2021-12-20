function solution(price, money, count) {
  const result = total_price(price, count) - money;
  return (result < 0) ? 0 : result;
}

function total_price(price, count) {
  let sum = 0;
  for (let i = 1; i <= count; i++)
    sum += price*i;
  return sum;
}

console.log(solution(3, 20, 4));
