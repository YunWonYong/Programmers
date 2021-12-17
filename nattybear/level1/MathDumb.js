function solution(answers) {

  const one   = new Student(1, [1,2,3,4,5]);
  const two   = new Student(2, [2,1,2,3,2,4,2,5]);
  const three = new Student(3, [3,3,1,1,2,2,4,4,5,5]);

  const students = [one, two, three];

  for (let student of students) {
    student.grade(answers);
  }

  const max = maximum(students.map(student => student.score));

  const result = students.filter(student => student.score === max);

  result.sort(student => student.name);

  return result.map(student => student.name);
}


class Student {
  constructor(name, pattern) {
    this.name = name;
    this.pattern = pattern;
  }

  grade(answers) {
    this.score =
      sum(
        zipWith(
          (x, y) => x === y ? 1 : 0, 
          answers,
          cycle(this.pattern)));
  }
}


const sum =
  xs => xs.reduce((acc, x) => acc + x);


const maximum =
  xs => xs.reduce((x, y) => x > y ? x : y);


function* cycle(xs) {
  while (true)
    for (let x of xs)
      yield x;
}


function zipWith(f, xs, ys) {
  const zs = [];
  for (let x of xs) {
    let y = ys.next().value;
    let z = f(x, y);
    zs.push(z);
  }
  return zs;
}


console.log(solution([1,2,3,4,5]));
console.log(solution([1,3,2,4,2]));
