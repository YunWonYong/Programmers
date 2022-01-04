import HandlingString from '../HandlingString';
test(`문자열 다루기 기본`, () => {
    expect(new HandlingString().solution("a1234")).toBeFalsy();
});
test(`문자열 다루기 기본`, () => {
    expect(new HandlingString().solution("1234")).toBeTruthy();
});