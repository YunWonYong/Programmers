function solution(lottos, win_nums) {
  const corrects = lottos.filter(x => win_nums.includes(x)).length
  const zeros = lottos.filter(x => x == 0).length
  const max = rank(corrects + zeros)
  const min = rank(corrects)
  return [max, min]
}

function rank(corrects) {
  let ranking
  switch (corrects) {
    case 6:
      ranking = 1
      break
    case 5:
      ranking = 2
      break
    case 4:
      ranking = 3
      break
    case 3:
      ranking = 4
      break
    case 2:
      ranking = 5
      break
    default:
      ranking = 6
  }
  return ranking
}
