import StringCompression from '../StringCompression';

test(`"abcabcabcabcdededededede" is 14`, () => {
    expect(new StringCompression().solution("abcabcabcabcdededededede")).toBe(14);
});

test(`"xababcdcdababcdcd" is 17`, () => {
    expect(new StringCompression().solution("xababcdcdababcdcd")).toBe(17);
});

test(`"ababcdcdababcdcd" is 9`, () => {
    expect(new StringCompression().solution("ababcdcdababcdcd")).toBe(9);
});

test(`"aabbaccc" is 7`, () => {
    expect(new StringCompression().solution("aabbaccc")).toBe(7);
});
