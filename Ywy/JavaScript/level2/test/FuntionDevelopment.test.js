import FunctionDevelopment from '../FunctionDevelopment';

test(`[93, 30, 55], [1, 30, 5] is [2, 1]]`, () => {
    expect(new FunctionDevelopment().solution([93, 30, 55], [1, 30, 5])).toEquals([2,1]);
});

test(`[95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1] is [1, 3, 2]`, () => {
    expect(new FunctionDevelopment().solution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1])).toEquals([1, 3, 2]);
});