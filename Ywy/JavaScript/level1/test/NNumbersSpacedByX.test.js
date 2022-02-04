import NNumbersSpacedByX from '../NNumbersSpacedByX';

test("2, 5 is [2,4,6,8,10]", () => {
    expect(new XNumbersSpacedByX().solution(2, 5)).toEqual([2, 4, 6, 8, 10]);
});

test("4, 3 is [4,8,12]", () => {
    expect(new XNumbersSpacedByX().solution(4, 3)).toEqual([4, 8, 12]);
});

test("-4, 2 is [-4, -8]", () => {
    expect(new XNumbersSpacedByX().solution(-4, 2)).toEqual([-4, -8]);
});