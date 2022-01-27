import HarshadNumber from '../HarshadNumber';

test("10 is true", () => {
    expect(new HarshadNumber().solution(10)).toBeTruthy();
});

test("13 is false", () => {
    expect(new HarshadNumber().solution(987)).toBeFalsy();
});