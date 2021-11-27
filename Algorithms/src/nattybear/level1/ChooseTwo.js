function solution(numbers) {

  const set = new Set();
  const size = numbers.length;
  
  for (let i = 0; i < size; i++)
    for (let j = i+1; j < size; j++)
      set.add(numbers[i] + numbers[j]);

  return Array.from(set).sort((x, y) => x - y);
}

console.log(solution([2,1,3,4,1]));
console.log(solution([5,0,2,7]));
