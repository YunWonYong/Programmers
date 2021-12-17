const solution = nums => {
  let answer = 0;
  const size = nums.length;
  for (let i = 0; i < size; i++) {
    for (let j = i+1; j < size; j++) {
      for (let k = j+1; k < size; k++) {
        let n = nums[i] + nums[j] + nums[k];
        if (isPrime(n)) answer++;
      }
    }
  }
  return answer;
}

const isPrime = num => {
  for (let i = 2, s = Math.sqrt(num); i <= s; i++)
    if (num % i === 0)
      return false;
  return num > 1;
}

console.log(solution([1,2,3,4]));
console.log(solution([1,2,7,6,4]));
