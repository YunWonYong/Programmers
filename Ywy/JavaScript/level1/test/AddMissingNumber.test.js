import AddMissingNumber from '../AddMissingNumber';
test("1 is 1", () => {
    expect(new AddMissingNumber().solution([1, 2, 3, 4, 5, 6, 7, 8, 9])).toBe(0);
});