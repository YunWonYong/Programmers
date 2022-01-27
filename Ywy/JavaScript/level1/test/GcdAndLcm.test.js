import GcdAndLcm from '../GcdAndLcm';

test("1, 3 is [3, 12]", () => {
    expect(new GcdAndLcm().solution(3, 12)).toEqual([3, 12]);
});

test("2, 5 is [1, 10]", () => {
    expect(new GcdAndLcm().solution(2, 5)).toEqual([1, 10]);
});