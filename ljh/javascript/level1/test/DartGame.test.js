import DartGame from '../DartGame';
test(`테스트 제목`, () => {
    expect(new DartGame().solution("1S2D*3T")).toBe(37);
});
