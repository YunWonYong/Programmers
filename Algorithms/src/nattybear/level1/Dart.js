function solution(dartResult) {

  const re = /(\d{1,2}[SDT][*#]{0,1})(\d{1,2}[SDT][*#]{0,1})(\d{1,2}[SDT][*#]{0,1})/
  const match = re.exec(dartResult);
  const chances = [];

  // 보너스 적용
  for (let i = 1; i <=3; i++) {
    const chance = new Chance(match[i]);
    chance.apply_bonus();
    chances.push(chance);
  }

  // 옵션 적용
  for (let i = 0; i < 3; i++) {
    const chance = chances[i];
    if (chance.option == '*') {
      chance.score *= 2;
      if (i == 0) continue;
      const prev = chances[i-1];
      prev.score *= 2;
    }
    else if (chance.option == '#')
      chance.score *= -1;
  }

  // 총점 계산
  let sum = 0;
  for (let chance of chances)
    sum += chance.score;

  return sum;
}

class Chance {
  constructor(s) {
    const re    = /(\d{1,2})([SDT])([*#]{0,1})/;
    this.score  = re.exec(s)[1];
    this.bonus  = re.exec(s)[2];
    this.option = re.exec(s)[3];
  }

  apply_bonus() {
    let n = 1;
    if (this.bonus == 'D')
      n = 2;
    else if (this.bonus == 'T')
      n = 3;
    this.score = Math.pow(this.score, n);
  }
}

console.log(solution("1S2D*3T"));
console.log(solution("1D2S#10S"));
console.log(solution("1D2S0T"));
console.log(solution("1S*2T*3S"));
console.log(solution("1D#2S*3S"));
console.log(solution("1T2D3D#"));
console.log(solution("1D2S3T*"));
