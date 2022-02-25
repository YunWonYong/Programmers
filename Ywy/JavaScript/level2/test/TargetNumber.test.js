import TargetNumber from '../TargetNumber';

test("[1, 1, 1, 1, 1], 3 is 5", () => {
    expect(new TargetNumber().solution([1, 1, 1, 1, 1], 3)).toBe(5);
});

test("[4, 1, 2, 1], 4 is 2", () => {
    expect(new TargetNumber().solution([4, 1, 2, 1], 4)).toBe(2);
});
