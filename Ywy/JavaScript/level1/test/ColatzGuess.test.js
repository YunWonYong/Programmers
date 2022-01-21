import ColatzGuess from '../ColatzGuess';

test("6 is 8", () => {
    expect(new ColatzGuess().solution(6)).toBe(8);
});

test("16 is 4", () => {
    expect(new ColatzGuess().solution(16)).toBe(4);
});

test("626331 is -1", () => {
    expect(new ColatzGuess().solution(626331)).toBe(-1);
});
