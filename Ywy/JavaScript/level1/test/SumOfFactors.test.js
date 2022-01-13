import SumOfFactors from '../SumOfFactors';

test('12 is 28', () => {
    expect(new SumOfFactors().solution(12)).toBe(28);
});

test('5 is 6', () => {
    expect(new SumOfFactors().solution(5)).toBe(6);
});
