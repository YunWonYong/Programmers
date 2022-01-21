import MinNumberRemove from '../MinNumberRemove';

test("[4,3,2,1] is [4,3,2]", () => {
    expect(new MinNumberRemove().solution([4, 3, 2, 1])).toEqual([4, 3, 2]);
});

test("[10] is [-1]", () => {
    expect(new MinNumberRemove().solution([10])).toEqual([-1]);
});