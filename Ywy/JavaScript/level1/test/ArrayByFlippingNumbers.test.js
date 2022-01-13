import ArrayByFlippingNumbers from '../ArrayByFlippingNumbers';

test("12345 is [5, 4, 3, 2, 1]", () => {
    expect(new ArrayByFlippingNumbers().solution(12345)).toEqual([5, 4, 3, 2, 1]);
});

test("987 is [7, 8, 9]", () => {
    expect(new ArrayByFlippingNumbers().solution(987)).toEqual([7, 8, 9]);
});