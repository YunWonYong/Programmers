import MatrixSum from '../MatrixSum';

test("[[1,2],[2,3]] + [[3,4],[5,6]] is [[4,6],[7,9]]", () => {
    expect(new MatrixSum().solution([[1, 2], [2, 3]], [[3, 4], [5, 6]])).toEqual([[4, 6], [7, 9]]);
});

test("[[1],[2]]	+ [[3],[4]]	is [[4],[6]]", () => {
    expect(new MatrixSum().solution([[1], [2]], [[3], [4]])).toEqual([[4], [6]]);
});