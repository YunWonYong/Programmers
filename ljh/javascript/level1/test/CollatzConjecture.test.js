import CollatzConjecture from '../CollatzConjecture'
test(`콜라츠 추측`, () =>{
    expect(new CollatzConjecture().solution(6)).toBe(8);
});
test(`콜라츠 추측`, () =>{
    expect(new CollatzConjecture().solution(16)).toBe(4);
});
test(`콜라츠 추측`, () =>{
    expect(new CollatzConjecture().solution(626331)).toBe(-1);
});