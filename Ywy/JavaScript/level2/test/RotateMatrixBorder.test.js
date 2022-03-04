import RotateMatrixBorder from '../RotateMatrixBorder';

test(`3, 3, [[1,1,2,2],[1,2,2,3],[2,1,3,2],[2,2,3,3]] is [1, 1, 5, 3]`, () => {
    expect(new RotateMatrixBorder().solution(3, 3, [[1, 1, 2, 2], [1, 2, 2, 3], [2, 1, 3, 2], [2, 2, 3, 3]])).toEqual([1, 1, 5, 3]);
});

test(`6, 6,	[[2,2,5,4],[3,3,6,6],[5,1,6,3]] is [8, 10, 25]`, () => {
    expect(new RotateMatrixBorder().solution(6, 6, [[2, 2, 5, 4], [3, 3, 6, 6], [5, 1, 6, 3]])).toEqual([8, 10, 25]);
});

test(`100, 97, [[1,1,100,97]] is [1]`, () => {
    expect(new RotateMatrixBorder().solution(100, 97, [[1, 1, 100, 97]])).toEqual([1]);
});
