function solution(newId) {
  const f = pipe(
    one,
    two,
    three,
    four,
    five,
    six,
    seven
  );

  return f(newId);
}


const pipe =
  (...fs) =>
    x =>
      fs.reduce((y, f) => f(y), x);


function filter(f, s1) {
  const s2 = [];
  for (let i = 0; i < s1.length; i++) {
    let c = s1[i];
    if (f(c))
      s2.push(c);
  }
  return s2.join("");
}


const one =
  s => s.toLowerCase();


const two =
  s => filter(x => /[a-z0-9_.-]/.test(x), s);


const three =
  s => s.replace(/[.]{2,}/g, ".");


const four =
  s => s.replace(/^[.]/, "").replace(/[.]$/, "");


const five =
  s => s.length == 0 ? "a" : s;


function six(s1) {
  const s2 = s1.slice(0, 15);
  return s2.slice(-1) == "." ? s2.slice(0, 14) : s2;
}


function seven(s) {
  if (s.length > 2)
    return s;

  const last = s.slice(-1);
  return (s + last + last).slice(0, 3);
}
