function solution(array, commands) {
  const answer = [];

  for (let command of commands)
    answer.push(helper(array, command));

  return answer;
}

function helper(array, command) {
  let i, j, k;
  [i, j, k] = command;
  const anArray = array.slice(i-1, j);
  anArray.sort((x, y) => x - y);
  return anArray[k-1];
}
