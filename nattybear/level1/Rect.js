function solution(sizes) {

  const cards = [];

  for (let [w, h] of sizes) {
    const card = new NameCard(w, h);
    cards.push(card);
  }

  const w = Math.max(...cards.map(x => x.max()));
  const h = Math.max(...cards.map(x => x.min()));

  return w * h;
}

class NameCard {
  constructor(w, h) {
    this.w = w;
    this.h = h;
  }

  max() {
    return Math.max(this.w, this.h);
  }

  min() {
    return Math.min(this.w, this.h);
  }
}

console.log(solution([[60, 50], [30, 70], [60, 30], [80, 40]]));
