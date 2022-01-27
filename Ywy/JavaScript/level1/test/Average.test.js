import Average from '../Average';

test("[1, 2, 3, 4] is 2.5", () => {
    expect(new Average().solution([1, 2, 3, 4])).toBe(2.5);
});

test("[5, 5] is 5", () => {
    expect(new Average().solution([5, 5])).toBe(5.0);
});