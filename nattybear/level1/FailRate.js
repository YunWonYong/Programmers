function solution(N, stages) {

  const list = [];

  for (let n = 1; n <= N; n++) {
    let fail = 0;
    let pass = 0;
    for (let stage of stages) {
      if (stage == n) {
        fail++;
        pass++;

      } else if (stage > n) {
        pass++;
      }
    }

    let stage = new Stage(n, fail, pass);
    stage.calc();

    list.push(stage);
  }

  list.sort((x, y) => {
    const z = y.rate - x.rate;

    if (z != 0)
      return z;

    return x.name - y.name;
  });

  return list.map(x => x.name);
}


class Stage {
  constructor(name, fail, pass) {
    this.name = name;
    this.fail = fail;
    this.pass = pass;
  }

  calc() {
    this.rate = this.fail == 0 ? 0 : this.fail / this.pass;
  }
}


console.log(solution(5, [2, 1, 2, 6, 2, 4, 3, 3]));
console.log(solution(4, [4, 4, 4, 4, 4]));
