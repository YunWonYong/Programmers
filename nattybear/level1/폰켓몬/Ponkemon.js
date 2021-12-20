function solution(nums) {
  const set = new Set(nums);
  const types = set.size;
  const max = Math.floor(nums.length / 2);
  return (types >= max) ? max : types;
}

console.log(solution([3,1,2,3]));
console.log(solution([3,3,3,2,2,4]));
console.log(solution([3,3,3,2,2,2]));
