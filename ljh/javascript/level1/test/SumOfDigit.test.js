import SumOfDigit from '../SumOfDigit';

test(`자릿수 더하기`, () => {
    expect(new SumOfDigit().solution(123)).toBe(6);
})

test(`자릿수 더하기`, () => {
    expect(new SumOfDigit().solution(987)).toBe(24);
})