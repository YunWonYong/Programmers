import IntactSquare from '../IntactSquare';

test(`8, 12 is 80`, () => {
    expect(new IntactSquare().solution(8, 12)).toBe(80);
});

test(`2, 5 is 4`, () => {
    expect(new IntactSquare().solution(2, 5)).toBe(4);
});