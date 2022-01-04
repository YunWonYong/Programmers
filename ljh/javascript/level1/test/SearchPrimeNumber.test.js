import SearchPrimeNumber from '../SearchPrimeNumber'
test(`소수 찾기`, () => {
    expect(expect(new SearchPrimeNumber().solution(10)).toBe(4));
});
test(`소수 찾기`, () => {
    expect(expect(new SearchPrimeNumber().solution(5)).toBe(3));
});