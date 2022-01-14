import SumOfDivisor from '../SumOfDivisor';
test(`약수의 합`, () => {
    expect(new SumOfDivisor().solution(12)).toBe(28);
});
test(`약수의 합`, () => {
    expect(new SumOfDivisor().solution(5)).toBe(6);
});