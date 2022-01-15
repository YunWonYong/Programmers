import NumberSquareRootDiscrimination from '../NumberSquareRootDiscrimination';

test("121 is 144", () => {
    expect(new NumberSquareRootDiscrimination().solution(121)).toBe(144);
});

test("3 is -1", () => {
    expect(new NumberSquareRootDiscrimination().solution(3)).toBe(-1);
});