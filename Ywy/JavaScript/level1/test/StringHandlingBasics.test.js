import StringHandlingBasics from '../StringHandlingBasics';

test('"a234" is false', () => {
    expect(new StringHandlingBasics().solution("a234")).toBeFalsy();
});

test('"1234" is true', () => {
    expect(new StringHandlingBasics().solution("1234")).toBeTruthy();
});