import AddDigits from '../AddDigits';

test("123 is 6", () => {
    expect(new AddDigits().solution(123)).toBe(6);
});

test("987 is 24", () => {
    expect(new AddDigits().solution(987)).toBe(24);
});