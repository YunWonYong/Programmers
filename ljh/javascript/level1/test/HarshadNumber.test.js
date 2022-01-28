import HarshadNumber from '../HarshadNumber';
test(`하샤드 수`, ()=>{
    expect(new HarshadNumber().solution(10)).toBeTruthy();
});
test(`하샤드 수`, ()=>{
    expect(new HarshadNumber().solution(12)).toBeTruthy();
});
test(`하샤드 수`, ()=>{
    expect(new HarshadNumber().solution(11)).toBeFalsy();
});
test(`하샤드 수`, ()=>{
    expect(new HarshadNumber().solution(13)).toBeFalsy();
});