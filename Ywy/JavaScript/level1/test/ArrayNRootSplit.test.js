import ArrayNRootSplit from '../ArrayNRootSplit';

test("3, 2, 5 is [3, 2, 2, 3]", () => {
    expect(new ArrayNRootSplit().solution(3, 2, 5)).toEqual([3, 2, 2, 3]);
});

test("4, 7, 14 is [4, 3, 3, 3, 4, 4, 4, 4]", () => {
    expect(new ArrayNRootSplit().solution(4, 7, 14)).toEqual([4, 3, 3, 3, 4, 4, 4, 4]);
});