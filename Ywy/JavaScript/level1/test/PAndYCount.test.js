import PAndYCount from '../PAndYCount';
test("pPoooyY is true", () => {
    expect(new PAndYCount().solution("pPoooyY")).toBeTruthy();
});

test("Pyy is false", () => {
    expect(new PAndYCount().solution("Pyy")).toBeFalsy();
});