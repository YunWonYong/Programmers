import MaximizeFormulas from '../MaximizeFormulas';

test(`"100-200*300-500+20" is 60420`, () => {
    expect(new MaximizeFormulas().solution("100-200*300-500+20")).toBe(60420);
});