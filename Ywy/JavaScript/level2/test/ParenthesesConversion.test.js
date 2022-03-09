import ParenthesesConversion from '../ParenthesesConversion';

test(`"(()())()" is "(()())()"`, () => {
    expect(new ParenthesesConversion().solution("(()())()")).toBe("(()())()");
});

test(`"()))((()" is "()(())()"`, () => {
    expect(new ParenthesesConversion().solution("()))((()")).toBe("()(())()");
});